package com.Constructor;

public class Constructor {
	
	int empId;
	String empName;
	String department;
	float salary;
	
	//default constructor
	public Constructor() {
		empId=1;
		empName="Emp001";
		department="finance";
		salary=35000;
	}
	
	//parametrized constructor
	public Constructor(int empId,String empName,String department,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		Constructor e= new Constructor();
		Constructor e1= new Constructor(12, "Abc Xyz", "Training", 450000); 

		//calling default constructor
		e.display();
		//parametrized constructor
		e1.display();
		
		 
	
	}

	
}