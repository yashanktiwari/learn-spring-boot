package com.example.module2.springbootwebtutorial.services;

import com.example.module2.springbootwebtutorial.dto.EmployeeDTO;
import com.example.module2.springbootwebtutorial.entities.Employee;
import com.example.module2.springbootwebtutorial.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;

import java.util.List;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList
                .stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .toList();
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO inputEmployee) {
        Employee employee = modelMapper.map(inputEmployee, Employee.class);
        Employee savedEmployee = employeeRepository.save(employee);
        return modelMapper.map(savedEmployee, EmployeeDTO.class);
    }
}
