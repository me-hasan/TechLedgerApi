package com.binarydesign.techledgerapi.service;

import com.binarydesign.techledgerapi.exception.ResourceNotFoundException;
import com.binarydesign.techledgerapi.model.BlogPost;
import com.binarydesign.techledgerapi.dao.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepo repo;

    public List<BlogPost> getAllBlogs() {
        return repo.findAll();
    }

    public BlogPost addBlogPost(BlogPost blogPost) {
        return repo.save(blogPost);
    }

    public BlogPost getBlogPost(int blogPostId) {
        return repo.findById(blogPostId)
                .orElseThrow(() -> new ResourceNotFoundException("BlogPost not found with id " + blogPostId));
    }

    public BlogPost updateBlogPost(int blogPostId, BlogPost updatedBlogPost) {
        BlogPost existBlog = repo.findById(blogPostId)
                .orElseThrow(() -> new ResourceNotFoundException("BlogPost not found with id " + blogPostId));

        existBlog.setTitle(updatedBlogPost.getTitle());
        existBlog.setContent(updatedBlogPost.getContent());

        return repo.save(existBlog);
    }

    public void deleteBlogPost(int blogPostId) {
        if (!repo.existsById(blogPostId)) {
            throw new ResourceNotFoundException("BlogPost not found with id " + blogPostId);
        }
        repo.deleteById(blogPostId);
    }
}

