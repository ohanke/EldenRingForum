package com.oscarhanke.module.post.controller;

import com.oscarhanke.module.post.form.UserForm;
import com.oscarhanke.module.post.mappers.user.UserFormToEntityMapper;
import com.oscarhanke.module.post.repository.UserRepository;
import com.oscarhanke.module.post.repository.entity.UserEntity;
import com.oscarhanke.module.post.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String getRegistrationForm(Model model){
        model.addAttribute("userForm", new UserForm());
        return "registration.html";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute("user") UserForm userForm){
        UserEntity entity = UserFormToEntityMapper.map(userForm);
        userRepository.save(entity);
        return "redirect:/registration?success";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login.html";
    }
}
