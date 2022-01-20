package com.example.jwtdemo2.repo;

import com.example.jwtdemo2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
