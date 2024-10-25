package com.binarydesign.techledgerapi.controller;

import com.binarydesign.techledgerapi.model.BlogComment;
import com.binarydesign.techledgerapi.service.CommnetService;
import com.binarydesign.techledgerapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommnetService service;

    @GetMapping("/comments")
    public ResponseEntity<List<BlogComment>> getAllBlogs() {
        List<BlogComment> blogComments = service.getAllComments();
        return ResponseEntity.ok(blogComments);
    }

    @PostMapping("/comment")
    public ResponseEntity<BlogComment> addBlog(@RequestBody BlogComment blogComment) {
        BlogComment savedComment = service.addUser(blogComment);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedComment);
    }

    @GetMapping("/comment/{commentId}")
    public ResponseEntity<BlogComment> getUserByUserId(@PathVariable int commentId) {
        BlogComment comment = service.getComment(commentId);
        return ResponseEntity.ok(comment);
    }

    @PutMapping("/comment/{commentId}")
    public ResponseEntity<BlogComment> updateUserByUserId(@PathVariable int commentId, @RequestBody BlogComment updatedComment) {
        BlogComment updateComment = service.updateComment(commentId, updatedComment);
        return ResponseEntity.ok(updateComment);
    }

    @DeleteMapping("/comment/{commentId}")
    public ResponseEntity<String> deleteBlogPostByPostId(@PathVariable int commentId) {
        service.deleteComment(commentId);
        return ResponseEntity.ok("Deleted Successfully!");
    }
}
