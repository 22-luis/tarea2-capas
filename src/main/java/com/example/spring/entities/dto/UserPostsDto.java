package com.example.spring.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class UserPostsDto {

    private UUID id;
    private String message;
}
