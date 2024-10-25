package com.binarydesign.techledgerapi.service;

import com.binarydesign.techledgerapi.exception.ResourceNotFoundException;
import com.binarydesign.techledgerapi.model.BlogComment;
import com.binarydesign.techledgerapi.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommnetService {

    @Autowired
    private CommentRepo repo;
    
    public List<BlogComment> getAllComments() {
        return repo.findAll();
    }

    public BlogComment addUser(BlogComment blogComment) {
        return repo.save(blogComment);
    }

    public BlogComment getComment(int commentId) {
        return repo.findById(commentId)
                .orElseThrow(() -> new ResourceNotFoundException("CommentPost not found with id " + commentId));
    }

    public BlogComment updateComment(int commentId, BlogComment updatedComment) {
        BlogComment existingComment = repo.findById(commentId)
                .orElseThrow(() -> new ResourceNotFoundException("Comment not found with id " + commentId));

        existingComment.setContent(updatedComment.getContent());
        existingComment.setStatus(updatedComment.getStatus());
        
        return repo.save(existingComment);
    }

    public void deleteComment(int commentId) {
        if (!repo.existsById(commentId)) {
            throw new ResourceNotFoundException("CommentPost not found with id " + commentId);
        }
        repo.deleteById(commentId);
    }
}
