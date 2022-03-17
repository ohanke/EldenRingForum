package com.oscarhanke.module.post.mappers.post;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.form.PostForm;

public class PostFormToDtoMapper {
    public static PostDto map(PostForm postForm) {
        return new PostDto(
                postForm.getAuthor(),
                postForm.getTitle(),
                postForm.getContent()
        );
    }
}
