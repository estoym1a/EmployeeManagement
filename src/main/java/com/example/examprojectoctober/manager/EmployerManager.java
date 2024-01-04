package com.example.examprojectoctober.manager;

import com.example.examprojectoctober.entity.Employer;
import com.example.examprojectoctober.exception.EmployerNotFound;
import com.example.examprojectoctober.repository.EmployerRepository;
import com.example.examprojectoctober.service.EmployerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmployerManager implements EmployerService {


    private final EmployerRepository employerRepository;

    @Override
    public List<Employer> getAll() {
        return employerRepository.findAll();
    }

    @Override
    public Employer getById(int id) {
        return employerRepository.findById(id).orElseThrow(()->new EmployerNotFound("Employer Not Found"));
    }

    @Override
    public void create(Employer employer) {
        employerRepository.save(employer);

    }
}


