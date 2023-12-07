package com.example.backend_clima.repository;

import com.example.backend_clima.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    // Additional query methods can be added if needed
}
