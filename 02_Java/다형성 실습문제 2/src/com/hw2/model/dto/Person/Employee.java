package com.hw2.model.dto.Person;

public class Employee extends Person{
    private String position;
    
    public Employee() {
    	
    }

	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}
    
	
	
	@Override
    public String getInfo() {
    	
    }
}
