package org.example;

import org.example.learning.models.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/* Self try Interview Questions */
public class Try {

    public static void main(String[] args) {
        /* Get the count of each value in array */
        int[] arrayList = {1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 30, 30, 30};

        Map<Integer, Integer> distinctValueMap = new HashMap<>();

        for (int i : arrayList) {
            if (distinctValueMap.get(i) != null) {
                int value = distinctValueMap.get(i);
                distinctValueMap.put(i, ++value);
            } else {
                distinctValueMap.put(i, 1);
            }
        }

//        distinctValueMap.forEach((key, value) -> {
//            System.out.println(key + " has total occurance of " + value + " times");
//        });
//
//        Arrays
//                .stream(arrayList)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key, value) -> {
//                    System.out.println("The Number: " + key + " has " + value + " occurances.");
//                });


        List<Employee> employees = List.of(
                new Employee("Murugan", "IT", "SoftwareEngineer", 10000.00),
                new Employee("Mathina", "PROD", "SeniorEngineer", 11000.00),
                new Employee("Liyana", "IT", "SoftwareEngineer", 12000.00),
                new Employee("Pugazh", "IT", "SeniorEngineer", 15000.00),
                new Employee("Srinivasan", "PROD", "PrincipalEngineer", 12000.00),
                new Employee("Vijayarani", "HR", "HREngineer", 12000.00),
                new Employee("Vithiya", "HR", "HREngineer", 16000.00),
                new Employee("Senthil", "HRS", "Engineer", 15000.00)
        );

        // Find Employee with Salary Greater than Average Salary of their Department

        Map<String, Double> averageSalaryByDepartment = employees
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        )
                );

        averageSalaryByDepartment.forEach((department, salary) -> {
            System.out.println("The Average Salary for Department: "+department+" is: "+salary);
        });

        employees.stream().filter(
                employee ->
                    employee.getSalary() > averageSalaryByDepartment.get(employee.getDepartment())
        ).forEach((employee) -> {
            System.out.println("Employee "+employee.getEmployeeName()+" from department "+employee.getDepartment()+" has salary "+employee.getSalary()+" is more than department average of "+averageSalaryByDepartment.get(employee.getDepartment()));
        });
    }
}
