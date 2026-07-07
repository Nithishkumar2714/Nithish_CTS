package com.cognizant.demo.service;
import com.cognizant.demo.model.Employee;
import com.cognizant.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    public void addEmployee(Employee employee) {
        repository.save(employee);
    }
}
