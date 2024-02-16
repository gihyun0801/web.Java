package com.hw2.model.dto.Person;

public class Prisoner extends Person{
   
	
	private String crime;
	
	public Prisoner() {
		
	}

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}
	
	public String getInfo() {
		
	}

	
}
