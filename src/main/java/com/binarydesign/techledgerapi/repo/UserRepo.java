package com.binarydesign.techledgerapi.repo;


import com.binarydesign.techledgerapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
