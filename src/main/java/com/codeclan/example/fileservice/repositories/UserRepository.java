package com.codeclan.example.fileservice.repositories;

import com.codeclan.example.fileservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
