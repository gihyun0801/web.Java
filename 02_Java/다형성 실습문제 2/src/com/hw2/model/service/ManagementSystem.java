package com.hw2.model.service;

import com.hw2.model.dto.Person.Person;

public interface ManagementSystem{
     
	void addPerson(Person person);
	String removePerson(String id);
	void displayAllPersons();
	
	
	
}
