package com.example.examprojectoctober.service;

import com.example.examprojectoctober.entity.Employee;
import com.example.examprojectoctober.entity.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();

    Employer getById(int id);

    void create(Employer employer);
}
