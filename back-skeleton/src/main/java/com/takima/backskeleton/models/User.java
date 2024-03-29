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
    private Long userId;
    @Column(name = "username")
    private String username;
    /*@ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "major_id")
    private Major major;*/

    private User(Builder builder) {
        this.userId = builder.userId;
        this.username = builder.username;
        /*this.courses = builder.courses;
        this.major = builder.major;*/
    }
    public User() {
    }

    public static class Builder {
        private Long userId;
        private String username;
        /*private List<Course> courses;
        private Major major;*/

        public Builder id (Long id) {
            this.userId = id;
            return this;
        }

        public Builder firstName(String username) {
            this.username = username;
            return this;
        }
        /*public Builder courses(List<Course> courses) {
            this.courses = courses;
            return this;
        }
        public Builder major(Major major) {
            this.major = major;
            return this;
        }*/

        public User build() {
            return new User(this);
        }
    }
}
