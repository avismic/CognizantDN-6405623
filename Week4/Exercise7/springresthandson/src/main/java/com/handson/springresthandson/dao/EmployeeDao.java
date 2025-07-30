package com.handson.springresthandson.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.handson.springresthandson.model.Employee;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST; // [cite: 20]

    // Constructor to load data from XML [cite: 21]
    public EmployeeDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        EMPLOYEE_LIST = context.getBean("employeeList", ArrayList.class);
    }

    // Method to return the list [cite: 22]
    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}