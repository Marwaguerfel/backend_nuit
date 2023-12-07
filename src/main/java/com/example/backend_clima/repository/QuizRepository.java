package com.example.backend_clima.repository;

import com.example.backend_clima.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {
    // Additional query methods can be added if needed
}

