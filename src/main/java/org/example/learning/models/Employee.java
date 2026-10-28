package org.example.learning.models;

import java.util.UUID;

public class Employee {
    private String employeeName;

    private String employeeId;
    private String department;
    private String designation;
    private Double salary;

    public Employee(String employeeName, String department, String designation, Double salary) {
        this.employeeId = UUID.randomUUID().toString();
        this.employeeName = employeeName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
