package com.example.spring.entities.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Getter
public class CreatePostDto {

    @NotNull
    private UUID userId;

    @NotBlank
    @NotNull
    private String content;
}

