package com.hw1.run.Run;


import com.hw1.model.dto.Book.Book;
import com.hw1.model.dto.Book.Novel;
import com.hw1.model.dto.Book.Poetry;
import com.hw1.model.dto.Book.Textbook;

public class Run {
   public static void main(String[] args) {

	   
	   Book[] list = new Book[3];
	   
	   
	    list[0] = new Novel("해리포터", "J.K.롤링","판타지");
	    list[1] = new Textbook("자바 프로그래밍", "James Gosling","컴퓨터 과학");
	    list[2] = new Poetry("우리들의 사랑시", "김소월",30);
	   
	    for(int i = 0; i < list.length; i++) {
	    	
	    	list[i].displayInfo();
	    	
	    	
	    }
	   
   }
}
