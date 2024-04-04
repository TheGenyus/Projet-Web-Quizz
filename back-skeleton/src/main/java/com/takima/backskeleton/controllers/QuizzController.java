package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.QuizzDto;
import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.services.QuizzService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("quizzs")
@RestController
@RequiredArgsConstructor
public class QuizzController {
    private final QuizzService quizzService;
    @GetMapping("")
    public List<Quizz> listQuizzs() {
        return quizzService.findAll();
    }

    @GetMapping("/{id}")
    public Quizz getQuizzById(@PathVariable Long id) {
        return quizzService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteQuizz(@PathVariable Long id) {
        quizzService.deleteById(id);
    }

    @PostMapping("")
    public void addQuizz(@RequestBody QuizzDto quizzDto) {
        quizzService.addQuizz(quizzDto);
    }

    @PostMapping("/{id}")
    public void updateQuizz(@RequestBody QuizzDto quizzDto, @PathVariable Long id) {
        quizzService.updateQuizz(quizzDto, id);
    }
}
