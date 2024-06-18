package com.exempledeprojet.Userservice.service;

import com.exempledeprojet.Userservice.model.User;
import com.exempledeprojet.Userservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class UserService {
@Autowired
private final UserRepository userRepository;


public List<User> getAllUser() {
   return userRepository.findAll();
}
public User getUserById(Long id) {
    return userRepository.findById(id).orElse(null);
}
public User createUser(User user) {
    return userRepository.save(user);
}
public User updateUser(Long id, User user) {
    User userToUpdate = userRepository.findById(id).orElse(null);
    if (userToUpdate != null) {
        userToUpdate.setNom(user.getNom());
        userToUpdate.setPrenom(user.getPrenom());
        userToUpdate.setDateNais(user.getDateNais());
        return userRepository.save(userToUpdate);
    }
    return null;
}
public void deleteUser(Long id) {
    userRepository.deleteById(id);
}
}
