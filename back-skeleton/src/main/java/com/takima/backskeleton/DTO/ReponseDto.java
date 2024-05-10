package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Quizz;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReponseDto {
    private Question question_id;
    private String texte;
    private Boolean estCorrecte;
}
