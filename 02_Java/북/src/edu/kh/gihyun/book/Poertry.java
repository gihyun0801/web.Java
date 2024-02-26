package edu.kh.gihyun.book;

public class Poertry extends BookList{
    
	private int numberOfPoems;
	
	public Poertry() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Poertry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}




	@Override
	public void displayInfo() {
		System.out.printf("[시집] 제목 : %s / 저자 : %s / 시 수 : %d", getTitle(), getAuthor(), numberOfPoems);
		
	}

}
