package com.oscarhanke.module.post.controller;


import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.form.CommentForm;
import com.oscarhanke.module.post.form.PostForm;
import com.oscarhanke.module.post.mappers.post.PostDtoToEntityMapper;
import com.oscarhanke.module.post.mappers.post.PostFormToDtoMapper;
import com.oscarhanke.module.post.repository.entity.PostEntity;
import com.oscarhanke.module.post.repository.PostRepository;
import com.oscarhanke.module.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class PostController {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private PostService postService;

    @GetMapping("/post/{uuid}")
    public String getPost(@PathVariable("uuid") String uuid, Model model, Principal principal){
        model.addAttribute("post", postService.getPost(uuid, principal.getName()));
        CommentForm commentForm = new CommentForm();
        model.addAttribute("commentForm", commentForm);
        return "post.html";
    }

    @GetMapping("/createPost")
    public String getPostCreationForm(Model model){
        model.addAttribute("postForm", new PostForm());
        return "createPost.html";
    }

    @PostMapping("/savePost")
    public String saveCreatedPost(@ModelAttribute("postForm") PostForm postForm, Principal principal){
        PostDto postDto = PostFormToDtoMapper.map(postForm, principal);
        PostEntity postEntity = PostDtoToEntityMapper.map(postDto);
        postRepository.save(postEntity);
        return "redirect:post/" + postEntity.getUuid();
    }

    @GetMapping("/deletePost/{uuid}")
    public String deletePost(@PathVariable (name = "uuid") String uuid, Principal principal){
        if (postService.getPost(uuid, principal.getName()).isPrincipalAuthor()){
            postRepository.delete(postRepository.findOneByUuid(uuid));
        }
        return "redirect:/dashboard";
    }
}
