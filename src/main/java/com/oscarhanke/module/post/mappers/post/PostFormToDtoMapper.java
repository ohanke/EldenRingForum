package com.oscarhanke.module.post.mappers.post;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.form.PostForm;

import java.security.Principal;

public class PostFormToDtoMapper {
    public static PostDto map(PostForm postForm, Principal principal) {
        return new PostDto(
                principal.getName(),
                postForm.getTitle(),
                postForm.getTextArea()
        );
    }
}
