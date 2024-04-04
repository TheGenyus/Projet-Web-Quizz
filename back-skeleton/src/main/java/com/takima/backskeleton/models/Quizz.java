package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

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

    private Quizz(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
    }
    public Quizz() {
    }

    public static class Builder {
        private Long id;
        private String title;
        private String description;

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

        public Quizz build() {
            return new Quizz(this);
        }
    }
}
