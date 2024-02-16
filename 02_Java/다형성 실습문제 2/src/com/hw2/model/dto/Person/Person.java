package com.hw2.model.dto.Person;

public abstract class Person {
    protected String id;
    protected String name;
    
    public Person() {
    	
    }

	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
    
	
	public abstract String getInfo(); //person정보를 문자열로 리턴
    
}
