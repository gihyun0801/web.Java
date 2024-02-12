package edu.kh.oop.practice.model.vo.BookService;

import edu.kh.oop.practice.model.vo.Book.Book;
import java.util.Scanner;

public class SerVice {
   public void practice() {
	  
          Book a1 = new Book();
          
          System.out.println(a1.toString());
          
          a1.setTitle("자바의정석");
          a1.setPrice(30000);
          a1.setDisCountRate(0.2);
          a1.setAuthor("남궁성");
          
          System.out.print(a1.getTitle() + " / ");
          System.out.print(a1.getPrice() + " / ");
          System.out.print(a1.getDisCountRate() + " / ");
          System.out.print(a1.getAuthor());
          
          Book a2 = new Book();
          
	   
   }
   
  

}
