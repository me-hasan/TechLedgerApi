package com.binarydesign.techledgerapi.repo;


import com.binarydesign.techledgerapi.model.BlogComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<BlogComment, Integer> {
    List<BlogComment> findByBlogPostId(Long blogPostId);
}
