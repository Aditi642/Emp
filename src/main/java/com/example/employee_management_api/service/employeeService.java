package com.example.employee_management_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_management_api.model.Employee;

@Service
public class employeeService {
    private List<Employee> employees = new ArrayList<>();

    public employeeService(){
        employees.add(new Employee(1, "aditi", "devops", 50000));
        employees.add(new Employee(2, "vedant", "tetsing", 45000));
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }
}
