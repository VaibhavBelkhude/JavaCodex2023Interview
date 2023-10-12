package com.nt.test.list;

public class HigestSalaryEmp {
private Integer empId;
private String empName;
private String department;
private Double salary;

public HigestSalaryEmp(Integer empId, String empName, String department, Double salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.department = department;
	this.salary = salary;
}
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "HigestSalaryEmp [empId=" + empId + ", empName=" + empName + ", department=" + department + ", salary="
			+ salary + "]";
}

}
