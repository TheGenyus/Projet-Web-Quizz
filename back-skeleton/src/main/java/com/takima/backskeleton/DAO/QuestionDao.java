package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Reponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Long> {
    @Query("SELECT q.reponses FROM Question q WHERE q.id= :questionId")
    List<Reponse> getAllReponsesFromQuestion(Long questionId);
}
