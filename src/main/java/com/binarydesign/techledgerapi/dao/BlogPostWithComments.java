package com.binarydesign.techledgerapi.dao;

import com.binarydesign.techledgerapi.model.BlogComment;
import com.binarydesign.techledgerapi.model.BlogPost;

import java.util.List;

public class BlogPostWithComments {
    private BlogPost blogPost;
    private List<BlogComment> comments;

    public BlogPostWithComments(BlogPost blogPost, List<BlogComment> comments) {
        this.blogPost = blogPost;
        this.comments = comments;
    }

    public BlogPost getBlogPost() {
        return blogPost;
    }

    public void setBlogPost(BlogPost blogPost) {
        this.blogPost = blogPost;
    }

    public List<BlogComment> getComments() {
        return comments;
    }

    public void setComments(List<BlogComment> comments) {
        this.comments = comments;
    }
}
