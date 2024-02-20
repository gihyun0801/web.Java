package edu.kh.gihyun.Run;

import edu.kh.gihyun.vo.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    private Scanner sc = new Scanner(System.in);
    
    private List<Book> bookList = new ArrayList<Book>();
    
    public Run() {
    	
    	bookList.add(new Book("1111", "세이노의 가르침", "세미노", 6480, "데이원"));
    	bookList.add(new Book("2222", "문과남자의 과학공부", "유시민", 15750, "둘베개"));
    	bookList.add(new Book("3333", "역행자", "자칭", 17550, "웅진지식하우스"));
    	bookList.add(new Book("4444", "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
    	bookList.add(new Book("5555", "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
    	bookList.add(new Book("6666", "노인과 바다", "어니스트 헤밍웨이", 18000, "민음사"));
    	
    	
	}
    
   
    
    public void diplayMenu() {
    	
    	int menu = 0;
    	
    	do {
    		
    		System.out.println("====도서 수정====");
    		
    		System.out.print("수정할 도서 번호를 입력하세요 : ");
    		
    		
    		
    		
    		String sujeon = sc.next();
    		
                   if(!sujeon.equals("1111") && !sujeon.equals("2222") && !sujeon.equals("3333") && !sujeon.equals("4444") 
                		   && !sujeon.equals("5555") && !sujeon.equals("6666")) {
    			System.out.println("도서명이 맞는게 없습니다");
    			return;
    		}
    		
    		System.out.println("1. 도서명");
    		
    		System.out.println("2. 도서 저자");
    		
    		System.out.println("3. 도서 가격");
    		
    		System.out.println("4. 도서 출판사");
    		
    		System.out.println("5. 도서 정보 조회");
    		
    		System.out.println("0. 수정 종료");
    		
    		System.out.print("메뉴 선택 ? : ");
    		menu = sc.nextInt();
    		
    		sc.nextLine();
    		
    		
    		
    		
    		switch(menu) {
    		case 1 : 		for(Book book : bookList) {
        		if(book.getBookPno().equals(sujeon)) {
        			one(book);
        		}
        	};				break;
        	
    		case 2 :      for(Book book : bookList) {
    			if(book.getBookPno().equals(sujeon)) {
    				two(book);
    			}
    		};				break;
    		case 3 :      for(Book book : bookList) {
    			if(book.getBookPno().equals(sujeon)) {
    				three(book);
    			}
    		};				break;
    		case 4 :      for(Book book : bookList) {
        		if(book.getBookPno().equals(sujeon)) {
        			four(book);
        		}
        	};				break;
        	    
    		case 5 : 	 show(sujeon);
    				
        	
        	
        	
        		default : break;
        	
        	
    		
    		
    		
    	}
    	
    	
    	
    	
    }while(menu != 0);
    }
    
//    public Book ha(Book book) {
//    	
//    	
//    	
//    	
//    	return book;
//    	
//    	
//    }
    
    public Book one(Book yaya) {
    	
    	System.out.println("\n===도서명 수정===\n");
    	
    	System.out.print("수정할 도서명을 입력하세요 : ");
    	String name = sc.next();
    	
    	yaya.setTitle(name);
    	
    	System.out.println("도서명 수정완료");
    	
    	return yaya;
    	
    }
    
public Book two(Book yaya) {
    	
    	System.out.println("\n===도서 저자===\n");
    	
    	System.out.print("수정할 도서 저자명 을 입력하세요 : ");
    	String name = sc.next();
    	
    	yaya.setAuthor(name);
    	
    	System.out.println("도서저자명 수정완료");
    	
    	return yaya;
    	
    }
    
public Book three(Book yaya) {
	System.out.println("\n===도서 가격 수정===\n");
	
	System.out.print("수정할 도서 가격명 을 입력하세요 : ");
	int price = sc.nextInt();
	
	sc.nextLine();
	
	yaya.setPrice(price);
	
	System.out.println("도서가격 수정완료");
	
	return yaya;
	
}

public Book four(Book yaya) {
	System.out.println("\n===도서 출판사 수정===\n");
	
	System.out.print("수정할 도서 출판사를 입력하세요 : ");
	String name = sc.next();
	
	sc.nextLine();
	
	yaya.setChulPan(name);
	
	System.out.println("도서출판명 수정완료");
	
	return yaya;
	
}

public void show(String sujeong) {
	
	for(Book std : bookList) {
		
		if(std.getBookPno().equals(sujeong)) {
			System.out.println(std);;
			return;
		}
		
	}
	
	
	System.out.println("일치하는 번호가 없음");
	
	
	
}
    
    
}
