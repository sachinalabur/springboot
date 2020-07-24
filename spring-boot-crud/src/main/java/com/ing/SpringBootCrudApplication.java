package com.ing;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ing.controller.entity.Employee;
import com.ing.controller.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootCrudApplication implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e = new Employee();
		e.setName("Test");
		e.setGender("M");
		e.setAge(29);
		e.setSalary(30000d);
		
		Employee e1 = new Employee();
		e1.setName("Ran");
		e1.setGender("M");
		e1.setAge(30);
		e1.setSalary(50000d);
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e);
		employeeList.add(e1);
		
		
		employeeRepository.saveAll(employeeList);
		
		
	}

}
