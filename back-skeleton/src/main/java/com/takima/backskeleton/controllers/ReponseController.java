package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.QuestionDto;
import com.takima.backskeleton.DTO.ReponseDto;
import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Reponse;
import com.takima.backskeleton.services.QuestionService;
import com.takima.backskeleton.services.ReponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("reponses")
@RestController
@RequiredArgsConstructor
public class ReponseController {
    private final ReponseService reponseService;
    @GetMapping("")
    public List<Reponse> listReponses() {
        return reponseService.findAll();
    }

    @GetMapping("/{id}")
    public Reponse getReponseById(@PathVariable Long id) {
        return reponseService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteReponse(@PathVariable Long id) {
        reponseService.deleteById(id);
    }

    @PostMapping("")
    public void addReponse(@RequestBody ReponseDto reponseDto) {
        reponseService.addReponse(reponseDto);
    }

    @PostMapping("/{id}")
    public void updateReponse(@RequestBody ReponseDto reponseDto, @PathVariable Long id) {
        reponseService.updateReponse(reponseDto, id);
    }
}
