package com.cognizant.demo;

import com.cognizant.demo.model.Employee;
import com.cognizant.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		service.addEmployee(new Employee(101, "Nithish", 50000));
		System.out.println("Employee Saved Successfully");
	}
}
