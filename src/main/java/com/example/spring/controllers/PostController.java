package com.example.spring.controllers;

import com.example.spring.entities.Comments;
import com.example.spring.entities.dto.CreatePostDto;
import com.example.spring.entities.dto.LikeDto;
import com.example.spring.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<Void> createPost(@RequestBody CreatePostDto request){
        postService.createPost(request);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/likes")
    public ResponseEntity<Void> likePost(@RequestBody LikeDto request){
        postService.likePost(request.getUserId(), request.getPostId());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/likes")
    public ResponseEntity<Void> dislikePost(@RequestBody LikeDto request) {
        postService.dislikePost(request.getUserId(), request.getPostId());
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/post/{postId}/comments")
    public ResponseEntity<List<Comments>> getComments(@PathVariable UUID postId) {
        List<Comments> comments = postService.getCommentsByPostId(postId);
        return ResponseEntity.ok(comments);
    }

}
