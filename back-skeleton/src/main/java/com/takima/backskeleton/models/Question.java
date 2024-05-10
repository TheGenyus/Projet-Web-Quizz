package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "question")
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "texte_question")
    private String texte;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "quiz_id")
    private Quizz quizz;
    @OneToMany(mappedBy = "question")
    @JsonIgnore
    private List<Reponse> reponses;

    private Question(Builder builder) {
        this.id = builder.id;
        this.quizz = builder.quizz;
        this.texte = builder.texte;
        this.reponses = builder.reponses;
    }
    public Question() {
    }

    public static class Builder {
        private Long id;
        private Quizz quizz;
        private String texte;
        private List<Reponse> reponses;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }

        public Builder quiz_id(Quizz quizz) {
            this.quizz = quizz;
            return this;
        }

        public Builder texte(String texte) {
            this.texte = texte;
            return this;
        }

        public Builder reponses(List<Reponse> reponses) {
            this.reponses = reponses;
            return this;
        }

        public Question build() {
            return new Question(this);
        }
    }
}
