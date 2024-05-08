package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

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

    private Question(Builder builder) {
        this.id = builder.id;
        this.quizz = builder.quizz;
        this.texte = builder.texte;
    }
    public Question() {
    }

    public static class Builder {
        private Long id;
        private Quizz quizz;
        private String texte;

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

        public Question build() {
            return new Question(this);
        }
    }
}
