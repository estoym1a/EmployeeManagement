package com.example.examprojectoctober.repository;

import com.example.examprojectoctober.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
