package com.example.module2.springbootwebtutorial.controllers;

import com.example.module2.springbootwebtutorial.entities.Employee;
import com.example.module2.springbootwebtutorial.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(path = "/{employeeId}")
    public Employee getEmployee(@PathVariable(name = "employeeId") Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Employee> getAllEmployees(@RequestParam Integer age,
                                          @RequestParam(required = false) String sortBy) {
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee createNewEmployee(@RequestBody Employee inputEmployee) {
        return employeeRepository.save(inputEmployee);
    }
}
