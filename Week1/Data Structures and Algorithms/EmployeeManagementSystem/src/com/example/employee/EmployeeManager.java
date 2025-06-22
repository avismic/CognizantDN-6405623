package com.example.employee;

public class EmployeeManager {
    private final Employee[] employees;
    private int size = 0;

    public EmployeeManager(int capacity) {
        this.employees = new Employee[capacity];
    }

    public boolean addEmployee(Employee e) {
        if (size >= employees.length) return false;
        employees[size++] = e;
        return true;
    }

    public Employee searchById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                // shift left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                return true;
            }
        }
        return false;
    }
}
