package com.nt.test.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BMainLogic {

	public static void main(String[] args) {
		/*
		 * Scanner scn=new Scanner(System.in);
		 * System.out.println("Enter Department Name:"); String
		 * department=scn.nextLine();
		 */
		
		List<HigestSalaryEmp>list=new ArrayList<>();
		list.add(new HigestSalaryEmp(1234,"Vaibhav Belkhude","HR",450000.0));
		list.add(new HigestSalaryEmp(1235,"Abhinav Belkhude","QA",450000.0));
		list.add(new HigestSalaryEmp(1236,"Rahul Belkhude","PROD",650000.0));
		list.add(new HigestSalaryEmp(1237,"Ganesh Belkhude","FINANCE",350000.0));
		list.add(new HigestSalaryEmp(1238,"Ramesh Belkhude","HR",850000.0));
		list.add(new HigestSalaryEmp(1239,"Suresh Belkhude","Managemnt",470000.0));

		String targetDept="HR";
		HigestSalaryEmp emphigh=list.stream().filter(e->e.getDepartment().equals(targetDept))
		.max(Comparator.comparingDouble(HigestSalaryEmp::getSalary))
		.orElse(null);
		if(emphigh !=null) {
			System.out.println("targetDept:"+targetDept);
			System.out.println(emphigh.getEmpName());
			System.out.println(emphigh.getSalary());
		}
		System.out.println("No Employee found:"+targetDept+"::department");
	}

}
