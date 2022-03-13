package com.oscarhanke.module.post;

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

    @GetMapping("/post/{uuid}")
    public String getPost(@PathVariable("uuid") String uuid, Model model){
        model.addAttribute("post", postService.getPost(uuid));
        return "post.html";
    }
}
