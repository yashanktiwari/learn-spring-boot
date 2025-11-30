package com.example.module2.springbootwebtutorial.controllers;

import com.example.module2.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployee(@PathVariable(name = "employeeId") Long id) {
        return new EmployeeDTO(
                id,
                "Yashank",
                "yashank@gmaiil.com",
                18,
                LocalDate.of(2025, 11, 29),
                true);
    }

    @GetMapping
    public String sayHi(@RequestParam Integer age,
                        @RequestParam(required = false) String sortBy) {
        return "Hi " + age + " sortBy " + sortBy;
    }
}
