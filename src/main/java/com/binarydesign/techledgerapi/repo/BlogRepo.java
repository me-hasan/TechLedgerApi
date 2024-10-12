package com.binarydesign.techledgerapi.repo;


import com.binarydesign.techledgerapi.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo extends JpaRepository<BlogPost, Integer> {

}
