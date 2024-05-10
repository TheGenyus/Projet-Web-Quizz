package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Quizz;

import java.io.IOException;

public class QuizzMapper {
    public static Quizz fromDto(QuizzDto dto, Long id) throws IOException {
        return new Quizz.Builder()
                .id(id)
                .title(dto.getTitle())
                .description(dto.getDescription())
                .questions(dto.getQuestions())
                .build();
    }

    public static QuizzDto toDto (Quizz quizz){
        return QuizzDto.builder()
                .title(quizz.getTitle())
                .description(quizz.getDescription())
                .questions(quizz.getQuestions())
                .build();
    }
}
