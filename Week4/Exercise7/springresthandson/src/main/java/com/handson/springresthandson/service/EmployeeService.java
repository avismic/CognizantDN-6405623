package com.handson.springresthandson.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // [cite: 25]
import org.springframework.transaction.annotation.Transactional; // [cite: 27]

import com.handson.springresthandson.dao.EmployeeDao;
import com.handson.springresthandson.model.Employee;

@Service // [cite: 25]
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional // [cite: 27]
    public ArrayList<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees(); // [cite: 26]
    }
}