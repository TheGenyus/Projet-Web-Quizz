package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Question;

import java.io.IOException;

public class QuestionMapper {
    public static Question fromDto(QuestionDto dto, Long id) throws IOException {
        return new Question.Builder()
                .id(id)
                .quiz_id(dto.getQuiz_id())
                .texte(dto.getTexte())
                .reponses(dto.getReponses())
                .build();
    }

    public static QuestionDto toDto (Question question){
        return QuestionDto.builder()
                .quiz_id(question.getQuizz())
                .texte(question.getTexte())
                .reponses(question.getReponses())
                .build();
    }
}
