package com.example.module2.springbootwebtutorial.repositories;

import com.example.module2.springbootwebtutorial.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
