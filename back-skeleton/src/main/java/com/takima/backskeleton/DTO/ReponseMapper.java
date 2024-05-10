package com.takima.backskeleton.DTO;
import com.takima.backskeleton.models.Reponse;

import java.io.IOException;

public class ReponseMapper {
    public static Reponse fromDto(ReponseDto dto, Long id) throws IOException {
        return new Reponse.Builder()
                .id(id)
                .question_id(dto.getQuestion_id())
                .texte(dto.getTexte())
                .estCorrecte(dto.getEstCorrecte())
                .build();
    }

    public static ReponseDto toDto (Reponse reponse){
        return ReponseDto.builder()
                .question_id(reponse.getQuestion())
                .texte(reponse.getTexte())
                .estCorrecte((reponse.getEstCorrecte()))
                .build();
    }
}
