package com.oscarhanke.module.post.controller;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.form.CommentForm;
import com.oscarhanke.module.post.form.PostForm;
import com.oscarhanke.module.post.mappers.post.PostDtoToEntityMapper;
import com.oscarhanke.module.post.mappers.post.PostFormToDtoMapper;
import com.oscarhanke.module.post.repository.PostEntity;
import com.oscarhanke.module.post.repository.PostRepository;
import com.oscarhanke.module.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private PostService postService;

    @GetMapping("/post/{uuid}")
    public String getPost(@PathVariable("uuid") String uuid, Model model){
        model.addAttribute("post", postService.getPost(uuid));
        CommentForm commentForm = new CommentForm();
        model.addAttribute("commentForm", commentForm);
        return "post.html";
    }

    @GetMapping("/createPost")
    public String getPostCreationForm(Model model){
        PostForm postForm = new PostForm();
        model.addAttribute("postForm", postForm);
        return "createPost.html";
    }

    @PostMapping("/savePost")
    public String saveCreatedPost(@ModelAttribute("postForm") PostForm postForm){
        PostDto postDto = PostFormToDtoMapper.map(postForm);
        PostEntity postEntity = PostDtoToEntityMapper.map(postDto);
        postRepository.save(postEntity);
        return "redirect:post/" + postEntity.getUuid();
    }

    @GetMapping("/deletePost/{uuid}")
    public String deletePost(@PathVariable (name = "uuid") String uuid){
        postRepository.delete(postRepository.findOneByUuid(uuid));
        return "redirect:/dashboard";
    }
}
