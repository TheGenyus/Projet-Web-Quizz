package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ReponseDao;
import com.takima.backskeleton.DTO.ReponseDto;
import com.takima.backskeleton.DTO.ReponseMapper;
import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Reponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ReponseService {
    private final ReponseDao reponseDao;

    public List<Reponse> findAll() {
        Iterable<Reponse> it = reponseDao.findAll();
        List <Reponse> reponses = new ArrayList<>();
        it.forEach(reponses::add);
        return reponses ;
    }

    public Reponse getById(Long id) {
        return reponseDao.findById(id).orElseThrow();
    }

    @Transactional
    public void deleteById(Long id) {
        reponseDao.deleteById(id);
    }

    @Transactional
    public void addReponse(ReponseDto reponseDto) {
        Reponse reponse;
        try {
            reponse = ReponseMapper.fromDto(reponseDto, null);
        } catch (IOException e) {
            throw new RuntimeException("Error with Reponse image", e);
        }

        reponseDao.save(reponse);
    }

    @Transactional
    public void updateReponse(ReponseDto reponseDto, Long id) {
        reponseDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Reponse doesn't exist"));
        Reponse reponse;
        try {
            reponse = ReponseMapper.fromDto(reponseDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Reponse image", e);
        }
        reponseDao.save(reponse);
    }
}
