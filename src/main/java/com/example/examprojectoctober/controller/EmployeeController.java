package com.example.examprojectoctober.controller;

import com.example.examprojectoctober.entity.Employee;
import com.example.examprojectoctober.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
@RequiredArgsConstructor

public class EmployeeController {


    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAll() {
        return employeeService.getAll();

    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable int id) {
        return employeeService.getById(id);

    }

    @PostMapping("employee")

    public void create(@RequestBody Employee employee) {
        employeeService.create(employee);
    }
}


