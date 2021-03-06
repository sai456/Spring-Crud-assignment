package com.assignment.emp.empassignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue
	private Long id;
	private String firstname;
	private String lastName;
	protected Employee(){}
	
	public Employee(String firstname, String lastName) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstname;
	}


	public void setName(String firstname) {
		this.firstname = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
