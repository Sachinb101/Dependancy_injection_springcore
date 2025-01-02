package com.sb.beans;

public class Employee {
	
    private int emp_id;
	private String name;
	private Address address;
	
	// setter  method

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// method for showing fields
		public void display() {
			System.out.println("EmpId"+emp_id);
			System.out.println("Name"+name);
			System.out.println("Address"+address);

		}

}
