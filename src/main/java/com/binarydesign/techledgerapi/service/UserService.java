package com.binarydesign.techledgerapi.service;

import com.binarydesign.techledgerapi.exception.ResourceNotFoundException;
import com.binarydesign.techledgerapi.model.User;
import com.binarydesign.techledgerapi.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User addUser(User user) {
        return repo.save(user);
    }

    public User getUser(int userId) {
        return repo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));
    }

    public User updateUser(int userId, User updatedUser) {
        User existUesr = repo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));

        existUesr.setEmail(updatedUser.getEmail());
        existUesr.setUsername(updatedUser.getUsername());

        return repo.save(existUesr);
    }

    public void deleteUser(int userId) {
        if (!repo.existsById(userId)) {
            throw new ResourceNotFoundException("User not found with id " + userId);
        }
        repo.deleteById(userId);
    }
}
