package com.oscarhanke.module.post;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.form.PostForm;
import com.oscarhanke.module.post.mappers.PostDtoToEntityMapper;
import com.oscarhanke.module.post.mappers.PostFormToDtoMapper;
import com.oscarhanke.module.post.repository.PostEntity;
import com.oscarhanke.module.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewPostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/createPost")
    public String getPostCreationForm(Model model){
        PostForm postForm = new PostForm();
        model.addAttribute("postForm", postForm);
        return "newPostForm.html";
    }

    @PostMapping("/savePost")
    public String saveCreatedPost(@ModelAttribute("postForm") PostForm postForm){
        PostDto postDto = PostFormToDtoMapper.map(postForm);
        PostEntity postEntity = PostDtoToEntityMapper.map(postDto);
        postRepository.save(postEntity);
        return "redirect:post/" + postEntity.getUuid();
    }
}
