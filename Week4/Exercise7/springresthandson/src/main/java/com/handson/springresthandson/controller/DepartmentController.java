package com.handson.springresthandson.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.springresthandson.model.Department;
import com.handson.springresthandson.service.DepartmentService;

@RestController
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;

    // Method with URL "/departments" returning an array of departments [cite: 39]
    @GetMapping("/departments")
    public ArrayList<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}