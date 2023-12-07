package com.example.backend_clima.repository;

import com.example.backend_clima.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    // Additional query methods can be added if needed
}

