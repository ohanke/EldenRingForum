package com.oscarhanke.module.post.service;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.mappers.PostMapper;
import com.oscarhanke.module.post.repository.PostRepository;
import com.oscarhanke.module.post.repository.PostEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<PostDto> getPosts(){
        List<PostEntity> entities = postRepository.findAll();
        List<PostDto> dtos = PostMapper.map(entities);
        return dtos;
    }
}
