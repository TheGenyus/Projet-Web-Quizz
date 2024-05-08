package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Quizz;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {
    private Quizz quiz_id;
    private String texte;
}
