package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.User;

import java.io.IOException;

public class UserMapper {
    public static User fromDto(UserDto dto, Long id) throws IOException {
        return new User.Builder()
                .id(id)
                .firstName(dto.getUsername())
                /*.courses(dto.getCourses())
                .major(dto.getMajor())*/
                .build();
    }

    public static UserDto toDto (User user){
        return UserDto.builder()
                .username(user.getUsername())
                /*.courses(student.getCourses())
                .major(student.getMajor())*/
                .build();
    }
}
