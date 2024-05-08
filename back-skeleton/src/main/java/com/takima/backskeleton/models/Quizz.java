package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "quizzs")
@Getter
public class Quizz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titre_quiz")
    private String title;
    @Column(name = "description_quiz")
    private String description;
    @OneToMany(mappedBy = "quizz")
    @JsonIgnore
    private List<Question> questions;

    private Quizz(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.questions = builder.questions;
    }
    public Quizz() {
    }

    public static class Builder {
        private Long id;
        private String title;
        private String description;
        private List<Question> questions;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder questions(List<Question> questions) {
            this.questions = questions;
            return this;
        }

        public Quizz build() {
            return new Quizz(this);
        }
    }
}
