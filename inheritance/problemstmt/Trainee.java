package com.hef.inheritance.problemstmt;

/*
4.	Create the sub classes Manager and Trainee with base class Employee.
Create overloaded constructors which takes the below parameters and initializes them to their 
respective variables in the super class.

Constructor parameter	Instance Variable
Id	employeeId
Name	employeeName
Address	employeeAddress
Phone	employeePhone
Salary	basicSalary


long empId;
String empName;
String empAddress;
long empmo_no;
double empbasicsalary;
double spe_allownces=250.80;
double Hra=1000.50;





*/public class Trainee extends Employee {
	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	Trainee(int empId, String empname, String empAddress, long empmo_no, double empbasicsalary) {
		this.empName = empname;
		this.empAddress = empAddress;
		this.empmo_no = empmo_no;
		this.empbasicsalary = empbasicsalary;

	}
}
