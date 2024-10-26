package com.binarydesign.techledgerapi.controller;

import com.binarydesign.techledgerapi.dao.BlogPostWithComments;
import com.binarydesign.techledgerapi.model.BlogPost;
import com.binarydesign.techledgerapi.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/blogPosts")
    public ResponseEntity<List<BlogPost>> getAllBlogs() {
        List<BlogPost> blogPosts = blogService.getAllBlogs();
        return ResponseEntity.ok(blogPosts);
    }

    @PostMapping("/blogPost")
    public ResponseEntity<BlogPost> addBlog(@RequestBody BlogPost blogPost) {
        BlogPost savedBlogPost = blogService.addBlogPost(blogPost);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBlogPost);
    }

    @GetMapping("/blogPost/{blogPostId}")
    public ResponseEntity<BlogPost> getBlogPostByPostId(@PathVariable int blogPostId) {
        BlogPost blogPost = blogService.getBlogPost(blogPostId);
        return ResponseEntity.ok(blogPost);
    }

    @PutMapping("/blogPost/{blogPostId}")
    public ResponseEntity<BlogPost> updateBlogPostByPostId(@PathVariable int blogPostId, @RequestBody BlogPost updatedBlogPost) {
        BlogPost updatedPost = blogService.updateBlogPost(blogPostId, updatedBlogPost);
        return ResponseEntity.ok(updatedPost);
    }

    @DeleteMapping("/blogPost/{blogPostId}")
    public ResponseEntity<String> deleteBlogPostByPostId(@PathVariable int blogPostId) {
        blogService.deleteBlogPost(blogPostId);
        return ResponseEntity.ok("Deleted Successfully!");
    }

    @GetMapping("/blogPostsWithComments")
    public ResponseEntity<List<BlogPostWithComments>> getBlogPostsWithComments() {
        List<BlogPostWithComments> blogPostsWithComments = blogService.getBlogPostsWithComments();
        return ResponseEntity.ok(blogPostsWithComments);
    }
}
