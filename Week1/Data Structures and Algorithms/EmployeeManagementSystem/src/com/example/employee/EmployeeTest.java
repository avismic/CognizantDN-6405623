package com.example.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager mgr = new EmployeeManager(5);

        mgr.addEmployee(new Employee("E001", "Alice", "Developer", 75000));
        mgr.addEmployee(new Employee("E002", "Bob",   "Designer",  65000));
        mgr.addEmployee(new Employee("E003", "Carol", "Manager",   85000));

        System.out.println("All employees:");
        mgr.traverseEmployees();

        System.out.println("\nSearch for E002:");
        System.out.println(mgr.searchById("E002"));

        System.out.println("\nDelete E001:");
        mgr.deleteById("E001");
        mgr.traverseEmployees();
    }
}
