package com.binarydesign.techledgerapi.service;

import com.binarydesign.techledgerapi.model.BlogPost;
import com.binarydesign.techledgerapi.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    public BlogRepo repo;

    public List<BlogPost> getAllBlogs(){
        return repo.getAllBlogs();
    }

    public void addBlogPost(BlogPost blogPost){
        repo.addBlog(blogPost);
    }
}
