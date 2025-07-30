package com.handson.springresthandson.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handson.springresthandson.dao.DepartmentDao;
import com.handson.springresthandson.model.Department;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    public ArrayList<Department> getAllDepartments() { // [cite: 41]
        return departmentDao.getAllDepartments();
    }
}