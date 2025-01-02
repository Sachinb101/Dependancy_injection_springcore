package com.sb.beans;

public class Employee {
    private int emp_id;
	private String name;
	private Address address;
	
	// Creating a constructor
	public Employee(int emp_id,String name,Address address) {
		this.emp_id=emp_id;
		this.name=name;
		this.address=address;
	}
	// method for showing fields
		public void display() {
			System.out.println("EmpId"+emp_id);
			System.out.println("Name"+name);
			System.out.println("Address"+address);
		}

}
