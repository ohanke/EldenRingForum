package com.oscarhanke.module.post.service;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.mappers.post.PostEntityToDtoMapper;
import com.oscarhanke.module.post.repository.PostRepository;
import com.oscarhanke.module.post.repository.entity.PostEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<PostDto> getPosts(){
        List<PostEntity> entities = postRepository.findAll();
        List<PostDto> dtos = PostEntityToDtoMapper.map(entities);
        return dtos;
    }

    public PostDto getPost(String uuid, String principalName){
        List<PostEntity> entities = postRepository.findAll();
        PostEntity entity = entities.stream()
                .filter(i->i.getUuid().equals(uuid))
                .findFirst()
                .get();
        PostDto dto = PostEntityToDtoMapper.map(entity, principalName);
        return dto;
    }
}
