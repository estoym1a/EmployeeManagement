package com.example.examprojectoctober.manager;

import com.example.examprojectoctober.entity.Employee;
import com.example.examprojectoctober.exception.EmployeeNotFound;
import com.example.examprojectoctober.repository.EmployeeRepository;
import com.example.examprojectoctober.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeManager implements EmployeeService {


    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(int id) {
        return employeeRepository.findById(id).orElseThrow(()->new EmployeeNotFound("Employee Not Found"));
    }

    @Override
    public void create(Employee employee) {
        employeeRepository.save(employee);

    }
}
