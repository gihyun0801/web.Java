package edu.kh.gihyun.Animal;

public class Animal {
    
	private String eat;
	private String eatType;
	
	
	
	
	
	
	@Override
	public String toString() {
		return String.format("주식은 : %s 먹는 방법은 : %s", eat, eatType);
	}




	public Animal() {};
	
	
	
	
	public Animal(String eat, String eatType) {
		super();
		this.eat = eat;
		this.eatType = eatType;
	}
	
	
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public String getEatType() {
		return eatType;
	}
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	
	
	
	
}
