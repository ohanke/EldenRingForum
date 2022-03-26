package com.oscarhanke.module.post.mappers.comment;

import com.oscarhanke.module.post.form.CommentForm;
import com.oscarhanke.module.post.repository.entity.CommentEntity;
import com.oscarhanke.module.post.repository.entity.PostEntity;

import java.security.Principal;

public class CommentFormToEntityMapper {
    public static CommentEntity map(CommentForm commentForm, PostEntity postEntity, Principal principal){
        return new CommentEntity()
                .setAuthor(principal.getName())
                .setTextArea(commentForm.getTextArea())
                .setPost(postEntity);
    }
}
