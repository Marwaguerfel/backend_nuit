package com.example.backend_clima.repository;

import com.example.backend_clima.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
    // Additional query methods can be added if needed
}
