package com.nt.test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
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

public class HighestSalaryEmployeeFinder {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "HR", 50000.0));
        employees.add(new Employee("Alice", "IT", 60000.0));
        employees.add(new Employee("Bob", "IT", 75000.0));
        employees.add(new Employee("Eve", "Finance", 55000.0));
        employees.add(new Employee("Mike", "Finance", 70000.0));

        String departmentToFind = "IT";

        Optional<Employee> highestSalaryEmployee = employees.stream()
                .filter(employee -> employee.getDepartment().equals(departmentToFind))
                .max(Comparator.comparingDouble(Employee::getSalary));

        if (highestSalaryEmployee.isPresent()) {
            Employee employee = highestSalaryEmployee.get();
            System.out.println("Highest salary employee in the " + departmentToFind + " department: " + employee.getName() + " with a salary of $" + employee.getSalary());
        } else {
            System.out.println("No employee found in the " + departmentToFind + " department.");
        }
    }
}
