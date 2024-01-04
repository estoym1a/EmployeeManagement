package com.example.examprojectoctober.controller;

import com.example.examprojectoctober.entity.Employee;
import com.example.examprojectoctober.entity.Employer;
import com.example.examprojectoctober.service.EmployeeService;
import com.example.examprojectoctober.service.EmployerService;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employer")
@RequiredArgsConstructor

public class EmployerController {
    private final EmployerService employerService;

    @GetMapping("employers")
    public List<Employer> getAll() {
        return employerService.getAll();

    }

    @GetMapping("/{id}")
    public Employer getById(@PathVariable int id) {
        return employerService.getById(id);

    }

    @PostMapping("employer")
    public void create(@RequestBody Employer employer) {
        employerService.create(employer);

    }
}
