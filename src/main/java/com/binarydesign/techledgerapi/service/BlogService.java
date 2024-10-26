package com.binarydesign.techledgerapi.service;

import com.binarydesign.techledgerapi.dao.BlogRepo;
import com.binarydesign.techledgerapi.dao.CommentRepo;
import com.binarydesign.techledgerapi.dao.BlogPostWithComments;
import com.binarydesign.techledgerapi.exception.ResourceNotFoundException;
import com.binarydesign.techledgerapi.model.BlogComment;
import com.binarydesign.techledgerapi.model.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class BlogService {
    
    @Autowired
    private BlogRepo blogRepo;

    @Autowired
    private CommentRepo commentRepo;

    public List<BlogPost> getAllBlogs() {
        return blogRepo.findAll();
    }

    public BlogPost addBlogPost(BlogPost blogPost) {
        return blogRepo.save(blogPost);
    }

    public BlogPost getBlogPost(int blogPostId) {
        return blogRepo.findById(blogPostId)
                .orElseThrow(() -> new ResourceNotFoundException("BlogPost not found with id " + blogPostId));
    }

    public BlogPost updateBlogPost(int blogPostId, BlogPost updatedBlogPost) {
        BlogPost existBlog = blogRepo.findById(blogPostId)
                .orElseThrow(() -> new ResourceNotFoundException("BlogPost not found with id " + blogPostId));

        existBlog.setTitle(updatedBlogPost.getTitle());
        existBlog.setContent(updatedBlogPost.getContent());

        return blogRepo.save(existBlog);
    }

    public void deleteBlogPost(int blogPostId) {
        if (!blogRepo.existsById(blogPostId)) {
            throw new ResourceNotFoundException("BlogPost not found with id " + blogPostId);
        }
        blogRepo.deleteById(blogPostId);
    }

    public List<BlogPostWithComments> getBlogPostsWithComments() {
        return blogRepo.findAll().stream().map(blogPost -> {
            List<BlogComment> comments = commentRepo.findByBlogPostId(blogPost.getId());
            return new BlogPostWithComments(blogPost, comments);
        }).collect(Collectors.toList());
    }
}

