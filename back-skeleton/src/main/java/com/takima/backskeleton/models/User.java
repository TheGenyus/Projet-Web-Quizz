package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;

    private User(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
    }
    public User() {
    }

    public static class Builder {
        private Long id;
        private String username;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }

        public Builder userName(String username) {
            this.username = username;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
