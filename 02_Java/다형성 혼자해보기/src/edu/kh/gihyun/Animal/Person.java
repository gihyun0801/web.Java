package edu.kh.gihyun.Animal;

public class Person extends Animal{
      private String name;

	public Person(String eat, String eatType, String name) {
		super(eat, eatType);
		this.name = name;
	}

	@Override
	public String toString() {
		return super.toString() + " : " + name;
	}
      
      
}
