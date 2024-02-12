package edu.kh.oop.practice.model.vo.Book;

public class Book {

 private String title;
 private int price;
 private double disCountRate;
 private String author;
 
 public Book() {
	 
 };
 
 public Book(String title, int price) {
	 
 }
 
 public String toString() {
	 
	 return  this.title + " / " + this.price + " / " + this.disCountRate + " / " + this.author;
 }

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public double getDisCountRate() {
	return disCountRate;
}

public void setDisCountRate(double disCountRate) {
	this.disCountRate = disCountRate;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
	


	
	
}
