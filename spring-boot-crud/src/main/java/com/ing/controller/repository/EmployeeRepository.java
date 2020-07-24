package com.ing.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.controller.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
