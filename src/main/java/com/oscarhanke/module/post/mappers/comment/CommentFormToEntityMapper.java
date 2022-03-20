package com.oscarhanke.module.post.mappers.comment;

import com.oscarhanke.module.post.form.CommentForm;
import com.oscarhanke.module.post.repository.entity.CommentEntity;
import com.oscarhanke.module.post.repository.entity.PostEntity;

public class CommentFormToEntityMapper {
    public static CommentEntity map(CommentForm commentForm, PostEntity postEntity){
        return new CommentEntity()
                .setAuthor(commentForm.getAuthor())
                .setContent(commentForm.getContent())
                .setPost(postEntity);
    }
}
