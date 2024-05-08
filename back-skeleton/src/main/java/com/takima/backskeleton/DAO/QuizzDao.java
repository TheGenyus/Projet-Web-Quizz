package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizzDao extends JpaRepository<Quizz, Long> {
    @Query("SELECT q.questions FROM Quizz q WHERE q.id= :quizzId")
    List<Question> getAllQuestionsFromQuizz(Long quizzId);
}
