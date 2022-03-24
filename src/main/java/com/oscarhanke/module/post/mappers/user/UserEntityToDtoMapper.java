package com.oscarhanke.module.post.mappers.user;

import com.oscarhanke.module.post.dto.UserDto;
import com.oscarhanke.module.post.repository.entity.UserEntity;

public class UserEntityToDtoMapper {
    public UserDto map(UserEntity entity){
        return new UserDto()
                .setId(entity.getId())
                .setUsername(entity.getUsername())
                .setPassword(entity.getPassword())
                .setEmail(entity.getEmail())
                .setRole(entity.getRole())
                .setLocked(entity.isLocked());
    }
}
