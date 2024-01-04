package com.example.examprojectoctober.repository;

import com.example.examprojectoctober.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer,Integer> {
}
