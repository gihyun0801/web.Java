package com.hw1.model.dto.Book;

public class Novel extends Book{
      
	private String genre;
	
	public Novel() {}

	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}
	
	
	@Override
	public void displayInfo() {
          System.out.println("제목 : " + super.getTitle() + " 저자 : " + super.getAuthor() + " 장르 : " + genre);	  	
	}
	
}
