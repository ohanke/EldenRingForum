package com.oscarhanke.config;

import com.oscarhanke.module.post.repository.AttemptsRepository;
import com.oscarhanke.module.post.repository.UserRepository;
import com.oscarhanke.module.post.repository.entity.AttemptsEntity;
import com.oscarhanke.module.post.repository.entity.UserEntity;
import com.oscarhanke.module.post.service.SecurityUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AuthProvider implements AuthenticationProvider {
    private static final int ATTEMPTS_LIMIT = 3;
    @Autowired
    private SecurityUserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AttemptsRepository attemptsRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        // extract the user credentials
        String password = (String) authentication.getCredentials();

        // fetch user details from database
        Optional<UserEntity> userByUsername = userRepository.findUserEntityByUsername(username);

        // check if user is not locked
        if (userByUsername.isPresent()) {
            if (!userByUsername.get().isAccountNonLocked()) {
                throw new LockedException("Account locked");
            }

            if (passwordEncoder.matches(password, userByUsername.get().getPassword())) {
                processSuccessAttempt(username);
                return new UsernamePasswordAuthenticationToken(username, password, List.of());
            } else {
                processFailedAttempts(username, userByUsername.get());
            }
        }
        return null;
    }

    private void processSuccessAttempt(String username) {
        attemptsRepository.findAttemptsEntityByUsername(username)
                .ifPresent(userAttempts -> {
                    userAttempts.setAttempts(0);
                    attemptsRepository.save(userAttempts);
                });
    }

    private void processFailedAttempts(String username, UserEntity user) {
        Optional<AttemptsEntity>
                userAttempts = attemptsRepository.findAttemptsEntityByUsername(username);
        if (userAttempts.isEmpty()) {
            AttemptsEntity attempts = new AttemptsEntity();
            attempts.setUsername(username);
            attempts.setAttempts(1);
            attemptsRepository.save(attempts);
        } else {
            AttemptsEntity attempts = userAttempts.get();
            attempts.setAttempts(attempts.getAttempts() + 1);
            attemptsRepository.save(attempts);

            if (attempts.getAttempts() + 1 >
                    ATTEMPTS_LIMIT) {
                user.setAccountNonLocked(false);
                userRepository.save(user);
                throw new LockedException("Too many invalid attempts. Account is locked!!");
            }
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}