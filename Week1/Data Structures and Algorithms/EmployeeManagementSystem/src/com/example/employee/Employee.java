package com.example.employee;

public class Employee {
    private final String employeeId;
    private String name;
    private String position;
    private double salary;

    public Employee(String employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name       = name;
        this.position   = position;
        this.salary     = salary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName()  { return name; }
    public void   setName(String n) { this.name = n; }
    public String getPosition() { return position; }
    public void   setPosition(String p) { this.position = p; }
    public double getSalary(){ return salary; }
    public void   setSalary(double s) { this.salary = s; }

    @Override
    public String toString() {
        return String.format(
            "Employee[id=%s, name=%s, position=%s, salary=%.2f]",
            employeeId, name, position, salary
        );
    }
}
