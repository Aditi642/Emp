package com.example.employee_management_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_management_api.model.Employee;
import com.example.employee_management_api.service.employeeService;


@RestController
public class employeeController {
    @Autowired
    private employeeService EmployeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return EmployeeService.getAllEmployees();
    }
    
}
