package com.hw1.model.dto.Book;

public class Textbook extends Book{

	
	private String subject;
	
	public Textbook() {
		
	}

	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}
	
	
	@Override
	public void displayInfo() {
		System.out.println("제목 : " + super.getTitle() + " 저자 : " + super.getAuthor() + "과목 : " + subject);	  	
	}
	
	
	
	
}
