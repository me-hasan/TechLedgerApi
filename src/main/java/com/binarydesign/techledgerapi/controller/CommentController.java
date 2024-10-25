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
@RequestMapping("/api/blogPost")
public class CommentController {

    @Autowired
    private CommnetService service;

    @GetMapping("{blogPostId}/comments")
    public ResponseEntity<List<BlogComment>> getAllCommentsByBlog(@PathVariable Long blogPostId) {
        List<BlogComment> blogComments = service.getAllCommentsByBlogPostId(blogPostId);
        return ResponseEntity.ok(blogComments);
    }

    @PostMapping("{blogPostId}/comment")
    public ResponseEntity<BlogComment> addNewCommentByBlog(@PathVariable Long blogPostId, @RequestBody BlogComment blogComment) {
        BlogComment savedComment = service.addNewCommentByBlogPostId(blogPostId, blogComment);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedComment);
    }

    @PutMapping("/comment/{commentId}")
    public ResponseEntity<BlogComment> updateCommentByCommentId(@PathVariable int commentId, @RequestBody BlogComment updatedComment) {
        BlogComment updateComment = service.updateComment(commentId, updatedComment);
        return ResponseEntity.ok(updateComment);
    }

    @DeleteMapping("/comment/{commentId}")
    public ResponseEntity<String> deleteCommentByCommentId(@PathVariable int commentId) {
        service.deleteComment(commentId);
        return ResponseEntity.ok("Deleted Successfully!"); // Returns 204 No Content on successful deletion
    }
}
