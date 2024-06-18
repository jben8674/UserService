package com.exempledeprojet.Userservice.repository;

import com.exempledeprojet.Userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
