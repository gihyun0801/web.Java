package edu.kh.oop.abstraction.model.service;


import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
     
	// ctrl + shift + o :해당 클래스에서 임포트 안된거 전부 임포트하기
	public void ex1() {
	
		
		People practice = new People();
		
		
		practice.setName("이성범");
		practice.setAdderss("서울 창동아파트");
		practice.setAge(25);
		practice.setGender('남');
		practice.setPhone("010-5260-8965");
		practice.setPno("001229-3031229");
		
		System.out.println("이름 : " + practice.getName());
		System.out.println("성별 : " + practice.getGender());
		System.out.println("주민번호 : " + practice.getpNo());
		System.out.println("주소 : " + practice.getAddress());
		System.out.println("폰번호 : " + practice.getPhone());
		System.out.println("나이 : " + practice.getAge());
		
		People practice2 = new People();
		
		practice.setName("이정재");
		practice.setAdderss("병신");
		practice.setAge(55);
		practice.setGender('남');
		practice.setPhone("010-2108-2095");
		practice.setPno("001012-3032012");
		
		System.out.println("이름 : " + practice.getName());
		System.out.println("성별 : " + practice.getGender());
		System.out.println("주민번호 : " + practice.getpNo());
		System.out.println("주소 : " + practice.getAddress());
		System.out.println("폰번호 : " + practice.getPhone());
		System.out.println("나이 : " + practice.getAge());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

