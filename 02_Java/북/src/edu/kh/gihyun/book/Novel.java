package edu.kh.gihyun.book;

public class Novel extends BookList{

	private String genre;
	
	
	
	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	public Novel() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void displayInfo() {
		System.out.printf("[소설] 제목 : %s / 저자 : %s / 장르 : %s", getTitle(), getAuthor(), genre);
		
	}

}
