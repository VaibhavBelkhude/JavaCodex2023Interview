package com.nt.test;
import java.util.*;
import java.util.stream.Collectors;

class Employees {
    private String name;
    private String department;
    private double salary;

    public Employees(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class HighestSalaryByDepartment {
    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees("John", "HR", 50000.0));
        employees.add(new Employees("Alice", "IT", 60000.0));
        employees.add(new Employees("Bob", "IT", 75000.0));
        employees.add(new Employees("Eve", "Finance", 55000.0));
        employees.add(new Employees("Mike", "Finance", 70000.0));

        Map<String, Employees> highestSalaryByDepartment = employees.stream()
                .collect(Collectors.toMap(
                        Employees::getDepartment, // Key mapper
                        e -> e, // Value mapper (employee object)
                        (existing, replacement) -> 
                        existing.getSalary() 
                        >= replacement.getSalary() ? existing : replacement
                ));

        highestSalaryByDepartment.forEach((department, employee) ->
                System.out.println("!Highest salary employee in " + department + ":"
                	+ " " + employee.getName() + " with a salary of $" + employee.getSalary())
        );
    }
}
