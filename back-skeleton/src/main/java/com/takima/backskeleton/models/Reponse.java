package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "reponse")
@Getter
public class Reponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "texte_reponse")
    private String texte;
    @Column(name = "est_correcte")
    private Boolean estCorrecte;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "question_id")
    private Question question;

    private Reponse(Builder builder) {
        this.id = builder.id;
        this.question = builder.question;
        this.estCorrecte = builder.estCorrecte;
        this.texte = builder.texte;
    }
    public Reponse() {
    }

    public static class Builder {
        private Long id;
        private Question question;
        private String texte;
        private Boolean estCorrecte;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }

        public Builder question_id(Question question) {
            this.question = question;
            return this;
        }

        public Builder texte(String texte) {
            this.texte = texte;
            return this;
        }

        public Builder estCorrecte(Boolean estCorrecte) {
            this.estCorrecte = estCorrecte;
            return this;
        }

        public Reponse build() {
            return new Reponse(this);
        }
    }
}
