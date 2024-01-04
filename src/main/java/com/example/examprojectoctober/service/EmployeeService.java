package com.example.examprojectoctober.service;

import com.example.examprojectoctober.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    Employee getById(int id);

    void create(Employee employee);
}

