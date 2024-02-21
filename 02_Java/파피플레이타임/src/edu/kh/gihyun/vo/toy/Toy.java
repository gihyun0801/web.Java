package edu.kh.gihyun.vo.toy;

public class Toy {
  
private String toyName;
private int ageException;
private int price;
private String color;
private int jeJo;
private String items;


@Override
public String toString() {
	return String.format("장난감이름 : %s / 사용가능연령 : %d  / 가격 : %d / 색상: %s / 제조년원일 : %d / 재료 : %s", 
	toyName, ageException,price,color,jeJo,items		);
}



public Toy() {
}








public Toy(String toyName, int ageException, int price, String color, int jeJo, String items) {
	super();
	this.toyName = toyName;
	this.ageException = ageException;
	this.price = price;
	this.color = color;
	this.jeJo = jeJo;
	this.items = items;
}





public String getToyName() {
	return toyName;
}
public void setToyName(String toyName) {
	this.toyName = toyName;
}
public int getAgeException() {
	return ageException;
}
public void setAgeException(int ageException) {
	this.ageException = ageException;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getJeJo() {
	return jeJo;
}
public void setJeJo(int jeJo) {
	this.jeJo = jeJo;
}
public String getItems() {
	return items;
}
public void setItems(String items) {
	this.items = items;
}
	 
	
	 
	 
	 
}
