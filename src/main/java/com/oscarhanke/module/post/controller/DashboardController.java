package com.oscarhanke.module.post.controller;

import com.oscarhanke.module.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DashboardController {

    @Autowired
    private PostService postService;

    @GetMapping("/dashboard")
    public String getHome(Model model){
        model.addAttribute("posts", postService.getPosts());
        return "dashboard.html";
    }
}
