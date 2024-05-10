package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.QuizzDao;
import com.takima.backskeleton.DTO.QuizzDto;
import com.takima.backskeleton.DTO.QuizzMapper;
import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.models.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class QuizzService {
    private final QuizzDao quizzDao;

    public List<Quizz> findAll() {
        Iterable<Quizz> it = quizzDao.findAll();
        List <Quizz> quizzs = new ArrayList<>();
        it.forEach(quizzs::add);
        return quizzs ;
    }

    public Quizz getById(Long id) {
        return quizzDao.findById(id).orElseThrow();
    }

    @Transactional
    public void deleteById(Long id) {
        quizzDao.deleteById(id);
    }

    @Transactional
    public void addQuizz(QuizzDto quizzDto) {
        Quizz quizz;
        try {
            quizz = QuizzMapper.fromDto(quizzDto, null);
        } catch (IOException e) {
            throw new RuntimeException("Error with Quizz image", e);
        }

        quizzDao.save(quizz);
    }

    @Transactional
    public void updateQuizz(QuizzDto quizzDto, Long id) {
        quizzDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Quizz doesn't exist"));
        Quizz quizz;
        try {
            quizz = QuizzMapper.fromDto(quizzDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with User image", e);
        }
        quizzDao.save(quizz);
    }

    public List<Question> getQuestionsOfQuizz(Long id) {
        return quizzDao.getAllQuestionsFromQuizz(id);
    }
}
