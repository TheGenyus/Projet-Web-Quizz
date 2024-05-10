package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.models.Reponse;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {
    private Quizz quiz_id;
    private String texte;
    private List<Reponse> reponses;
}
