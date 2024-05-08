package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Question;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuizzDto {
    private String title;
    private String description;
    private List<Question> questions;
}
