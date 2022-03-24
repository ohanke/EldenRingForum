package com.oscarhanke.module.post.service;

import com.oscarhanke.module.post.repository.UserRepository;
import com.oscarhanke.module.post.repository.entity.UserEntity;
import com.oscarhanke.module.post.repository.entity.UserRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserService implements  UserRepository,UserDetailsService {





    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findUserEntityByEmail(username);
        if (user == null){
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return new User(user.getEmail(), user.getPassword(), (Collection<? extends GrantedAuthority>) mapUserRolesToAuthorities(user.getRole()));
    }

    private GrantedAuthority mapUserRolesToAuthorities(UserRoles role){
        return new SimpleGrantedAuthority(role.name());
    }
}
