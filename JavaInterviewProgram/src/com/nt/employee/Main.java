package com.nt.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<Employee>emplist=new ArrayList<>();
		emplist.add(new Employee(1021,"Vaibhav B","IT","Male",31,58000.0d));
		emplist.add(new Employee(1022,"Ashwini","IT","Female",31,508000.0d));
		emplist.add(new Employee(1023,"Rakhi b","IT","Female",31,158000.0d));
		emplist.add(new Employee(1024,"Radha b","HR","Female",31,78000.0d));
		emplist.add(new Employee(1025,"Purva b","HR","Female",31,48000.0d));
		
		//! First way
		Optional<Double> secondLargestSalary1 = emplist.stream()
                .filter(employee -> "IT".equals(employee.getDepartment()))
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(0)
                .findFirst();

        if (secondLargestSalary1.isPresent()) {
       //  Employee employee = secondLargestSalary.get();
           System.out.println("Second-largest salary among Department employees: " + secondLargestSalary1.get());
          // Employee emps=secondLargestSalary1.get();
          //  System.out.println("Name: " + employee.getEmpname());
        } else {
            System.out.println("No female employees found.");
        }
	 

		 Optional<Double> secondLargestSalary = emplist.stream()
	                .filter(employee -> "Female".equals(employee.getGender()))
	                .map(Employee::getSalary)
	                .distinct()
	                .sorted(Comparator.reverseOrder())
	                .skip(0)
	                .findFirst();

	        if (secondLargestSalary.isPresent()) {
	       //  Employee employee = secondLargestSalary.get();
	           System.out.println("Second-largest salary among female employees: " + secondLargestSalary.get());
	         //  Employee emp=secondLargestSalary.get();
	          //  System.out.println("Name: " + employee.getEmpname());
	        } else {
	            System.out.println("No female employees found.");
	        }
		 
	        Optional<Employee> secondLargestSalaryFemale = emplist.stream()
	                .filter(employee -> "Female".equals(employee.getGender()))
	                .sorted(Comparator.comparing(Employee::getSalary).reversed())
	                .skip(1)
	                .findFirst();

	            if (secondLargestSalaryFemale.isPresent()) {
	                Employee employee = secondLargestSalaryFemale.get();
	                System.out.println("Name: " + employee.getEmpname());
	                System.out.println("Salary: " + employee.getSalary());
	            } else {
	                System.out.println("No female employees found.");
	            }
	            
	            //find hiegst salary from department
	            Optional<Employee> secondLargestSalaryDepart = emplist.stream()
		                .filter(employee -> "HR".equals(employee.getDepartment()))
		                .sorted(Comparator.comparing(Employee::getSalary).reversed())
		                .skip(0)
		                .findFirst();

		            if (secondLargestSalaryDepart.isPresent()) {
		                Employee employee = secondLargestSalaryDepart.get();
		                System.out.println("Name: " + employee.getEmpname());
		                System.out.println("Salary: " + employee.getSalary());
		            } else {
		                System.out.println("No female employees found.");
		            }
	}
	            
}
