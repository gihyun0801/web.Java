package edu.kh.gihyun.book;

public class TextBook extends BookList{
	
	public String subject;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public TextBook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}




	@Override
	public void displayInfo() {
		System.out.printf("[전문 서적] 제목 : %s / 저자 : %s / 과목 : %s", getTitle(), getAuthor(), subject);
		
	}

}
