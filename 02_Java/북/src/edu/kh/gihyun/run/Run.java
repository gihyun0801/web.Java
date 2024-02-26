package edu.kh.gihyun.run;

import java.awt.print.Book;

import edu.kh.gihyun.book.BookList;
import edu.kh.gihyun.book.Novel;
import edu.kh.gihyun.book.Poertry;
import edu.kh.gihyun.book.TextBook;

public class Run {
   public static void main(String[] args) {
	
	   BookList[] sr = new BookList[3];
	   
	   
	   sr[0] = new TextBook("자바 프로그래밍", "James Golsling", "컴퓨터 과학");
	   sr[1] = new Poertry("우리들의 사랑시", "김소월", 30);
	   sr[2] = new Novel("해리 포터", "J.K 롤링", "판타지");
	   
	   
	   for(BookList book : sr) {
		   
		  book.displayInfo();
		   
	   }
	   
	   
}
}
