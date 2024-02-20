package edu.kh.gihyun.vo;

public class Book {
  
	private String bookPno;
	private String title;
	private String author;
	private int price;
	private String chulPan;
	
	public Book() {}
	
	public Book(String bookPno, String title, String author, int price, String chulPan) {
		super();
		this.bookPno = bookPno;
		this.title = title;
		this.author = author;
		this.price = price;
		this.chulPan = chulPan;
	}

	public String getBookPno() {
		return bookPno;
	}

	public void setBookPno(String bookPno) {
		this.bookPno = bookPno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getChulPan() {
		return chulPan;
	}

	public void setChulPan(String chulPan) {
		this.chulPan = chulPan;
	}

	
	
	@Override
	public String toString() {
		return String.format("%s번 도서 : [도서제목 : %s / 도서저자 : %s / 도서가격 : %d원 / 출판사 : %s]",
				bookPno, title, author, price, chulPan);
	}
	
	
	
	
	
	
}
