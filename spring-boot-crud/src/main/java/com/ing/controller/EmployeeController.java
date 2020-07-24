
package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ing.controller.entity.Employee;
import com.ing.controller.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable Long id) {
		return employeeRepository.findById(id).get();
	}

	@PostMapping("/employee/save")
	public void saveOrUpdate(@RequestBody Employee employee) {
		employeeRepository.save(employee);
	}

	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable Long id) {
		employeeRepository.deleteById(id);
		return "Employee with ID: " + id + " deleted succesfully";
	}

	@PostMapping("/employee/all")
	public String saveAll(@RequestBody List<Employee> employees) {
		employeeRepository.saveAll(employees);
		return "Succesfully saved " + employees.size() + " employees";
	}

}
