package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.User;

import java.io.IOException;

public class UserMapper {
    public static User fromDto(UserDto dto, Long id) throws IOException {
        return new User.Builder()
                .id(id)
                .userName(dto.getUsername())
                .build();
    }

    public static UserDto toDto (User user){
        return UserDto.builder()
                .username(user.getUsername())
                .build();
    }
}
