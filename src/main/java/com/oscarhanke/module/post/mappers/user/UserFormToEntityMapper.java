package com.oscarhanke.module.post.mappers.user;

import com.oscarhanke.module.post.form.UserForm;
import com.oscarhanke.module.post.repository.entity.UserEntity;
import com.oscarhanke.module.post.repository.entity.UserRoles;

public class UserFormToEntityMapper {
    public static UserEntity map(UserForm userForm){
        return new UserEntity()
                .setUsername(userForm.getUsername())
                .setPassword(userForm.getPassword())
                .setEmail(userForm.getEmail())
                .setRole(UserRoles.USER)
                .setLocked(false);
    }
}
