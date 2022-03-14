package com.oscarhanke.module.post;

import com.oscarhanke.module.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewPostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/newPost")
    public String getPostCreationForm(Model model){
        return "newPost.html";
    }
}
