package com.handson.springresthandson.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping; // [cite: 30]
import org.springframework.web.bind.annotation.RestController;

import com.handson.springresthandson.model.Employee;
import com.handson.springresthandson.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Method to expose employee list at /employees URL [cite: 29]
    @GetMapping("/employees") // [cite: 30]
    public ArrayList<Employee> getAllEmployees() {
        return employeeService.getAllEmployees(); // [cite: 31]
    }
}