package com.takima.backskeleton.DTO;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuizzDto {
    private String title;
    private String description;
}
