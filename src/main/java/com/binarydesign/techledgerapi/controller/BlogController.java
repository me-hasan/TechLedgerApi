package com.binarydesign.techledgerapi.controller;

import com.binarydesign.techledgerapi.model.BlogPost;
import com.binarydesign.techledgerapi.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private BlogService service;

    @GetMapping({"/blogPosts"})
    public List<BlogPost> getAllBlogs(Model model) {
         return service.getAllBlogs();
    }

    @PostMapping("/blogPost")
    public void addBlog(@RequestBody BlogPost blogPost) {
        service.addBlogPost(blogPost);
    }
}
