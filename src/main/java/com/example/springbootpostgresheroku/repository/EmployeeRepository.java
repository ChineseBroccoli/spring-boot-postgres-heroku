package com.example.springbootpostgresheroku.repository;

import com.example.springbootpostgresheroku.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
