package com.ge.practice;

public class EmployeeTest {
	
	private String empID;
	private String empName;
	private String sal;
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeTest [empID=" + empID + ", empName=" + empName + ", sal=" + sal + "]";
	}
	

}
