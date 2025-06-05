package com.example.spring.controllers;

import com.example.spring.entities.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class Example {

    @GetMapping(value = "/hello")
    public ResponseEntity<Post> respondWithExample(){
       return ResponseEntity.ok(new Post());
    }
}
