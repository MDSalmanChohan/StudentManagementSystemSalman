package com.example.StudentManagementSystemSalman.repository;



import com.example.StudentManagementSystemSalman.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

