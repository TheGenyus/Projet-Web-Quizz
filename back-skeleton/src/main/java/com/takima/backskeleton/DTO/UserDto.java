package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Course;
import com.takima.backskeleton.models.Major;
import com.takima.backskeleton.models.User;
import lombok.Builder;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;
import java.util.List;
@Builder
@Getter
public class UserDto {
    private String username;
    /*private List<Course> courses;
    private Major major;*/
}
