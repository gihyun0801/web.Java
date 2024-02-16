package com.hw2.model.service;

import com.hw2.model.dto.Person.Employee;
import com.hw2.model.dto.Person.Person;

public class Company implements ManagementSystem{
         
	
	
	int employeeCount = 0;
	
	public Company(int size) {};
	
	private Employee[] employees = new Employee[10]; 

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String removePerson(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayAllPersons() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
