package com.binarydesign.techledgerapi.controller;

import com.binarydesign.techledgerapi.model.User;
import com.binarydesign.techledgerapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllBlogs() {
        List<User> user = service.getAllUsers();
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user")
    public ResponseEntity<User> addBlog(@RequestBody User user) {
        User savedUser = service.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUserByUserId(@PathVariable int userId) {
        User user = service.getUser(userId);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/user/{userId}")
    public ResponseEntity<User> updateUserByUserId(@PathVariable int userId, @RequestBody User updatedUser) {
        User updateUser = service.updateUser(userId, updatedUser);
        return ResponseEntity.ok(updateUser);
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity<String> deleteBlogPostByPostId(@PathVariable int userId) {
        service.deleteUser(userId);
        return ResponseEntity.ok("Deleted Successfully!");
    }
}
