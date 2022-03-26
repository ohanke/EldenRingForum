package com.oscarhanke.module.post.controller;

import com.oscarhanke.module.post.form.CommentForm;
import com.oscarhanke.module.post.mappers.comment.CommentFormToEntityMapper;
import com.oscarhanke.module.post.repository.entity.CommentEntity;
import com.oscarhanke.module.post.repository.CommentRepository;
import com.oscarhanke.module.post.repository.entity.PostEntity;
import com.oscarhanke.module.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class CommentController {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/post/{uuid}/addComment")
    public String saveCreatedComment(
            @PathVariable("uuid") String uuid,
            @ModelAttribute("commentForm") CommentForm commentForm,
            Principal principal){
        PostEntity postEntity = postRepository.findOneByUuid(uuid);
        CommentEntity commentEntity = CommentFormToEntityMapper.map(commentForm, postEntity, principal);
        commentRepository.save(commentEntity);
        return "redirect:/post/{uuid}";
    }

    @GetMapping("post/{uuid}/deleteComment/{id}")
    public String deleteComment(@PathVariable ("id") Long id){
        commentRepository.delete(commentRepository.getById(id));
        return "redirect:/post/{uuid}";
    }
}