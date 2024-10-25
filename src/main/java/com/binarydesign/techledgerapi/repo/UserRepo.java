package com.binarydesign.techledgerapi.repo;


import com.binarydesign.techledgerapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends JpaRepository<User, Integer> {

}
