package com.binarydesign.techledgerapi.repo;


import com.binarydesign.techledgerapi.model.BlogComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<BlogComment, Integer> {

}
