package com.example.spring.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class UserDto {

    private UUID id;
    private String name;
    private String email;
}
