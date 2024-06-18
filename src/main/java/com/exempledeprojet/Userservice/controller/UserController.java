package com.exempledeprojet.Userservice.controller;

import com.exempledeprojet.Userservice.model.User;
import com.exempledeprojet.Userservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    public User getUserById( @PathVariable long id) {
        return userService.getUserById(id);

    }

    @PostMapping
    public User createUser( @RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser( @PathVariable  Long id ,@RequestBody User user) {
        return userService.updateUser(id, user);

    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable long id) {
        userService.deleteUser(id);
    }

}
