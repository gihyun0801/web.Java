package com.hw2.model.dto.Animal;

public class Tiger extends Animal{
   
	public Tiger() {}
	
	public Tiger(String name) {
		super(name);
		this.name = name;
	}
	
	
	@Override
	public void sound() {
		System.out.println( name + "이가 어흥하며 포효합니다");
	}
	
}
