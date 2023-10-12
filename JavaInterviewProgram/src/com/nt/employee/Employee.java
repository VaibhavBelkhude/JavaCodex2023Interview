package com.nt.employee;

public class Employee {

	private Integer id;
	private String empname;
	private String department;
	private String gender;
	private Integer age;
	private Double salary;
	
	public Employee(Integer id, String empname, String department, String gender, Integer age, Double salary) {
		super();
		this.id = id;
		this.empname = empname;
		this.department = department;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", department=" + department + ", gender=" + gender
				+ ", age=" + age + ", salary=" + salary + "]";
	}
	
}
