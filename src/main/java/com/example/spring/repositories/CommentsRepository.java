package com.example.spring.repositories;

import com.example.spring.entities.Comments;
import com.example.spring.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, UUID> {
    public List<Comments> findAllByPost(Post post);
}
