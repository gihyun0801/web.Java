package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

//비즈니스 로직 처리하는 클래스
public class InheritanceService {
    	
	 //상속 확인 예제
	
	public void ex1() {
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("============================");
		
		//person을 상속받은 Student가 person의 필드, 메소드를
		//정말 사용할 수 있을까?
		
		//Student
		
		Student std = new Student();
		
		std.setGrade(3);
		std.setClassRoom(5);
		
		//person 클래스로부터 상속받은 필드 메서드
		
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getName());		
		System.out.println(std.getAge());		
		System.out.println(std.getNationality());		
		System.out.println(std.getClassRoom());		
        System.out.println(std.getGrade());		
        
       
     
        
        Employee emp = new Employee();
        
        emp.setCompany("삼성");
        emp.setName("성기현");
        emp.setAge(25);
        emp.setNationality("일본");
        
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getNationality());
        System.out.println(emp.getCompany());
        
        p.breath();
        p.move();
        
        std.breath();
        std.move();
        
        emp.breath();
        emp.move();
        
        // 상속의 특징 : 코드 추가 및 수정에 용이함
        //            코드 길이 감소 및 중복 제거 효과
        
        
        
	}
	
	
	public void ex2() {
		
		//super() 생성자 이용방법
		
		
		//Student 매개변수 5개짜리 생성자
		
		Student std = new Student("김철수", 17, "한국", 1, 3);
		
		Person p1 = new Person();
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
      
		
	}
    
	
	public void ex3() {
		Student std = new Student();
		
		  Employee emp = new Employee();
	        
		    std.move(); // 오버라이딩 X -> 상속해준 부모의 메서드를 실행
		    
		    System.out.println();
		    
	        emp.move(); // 오버라이딩 o -> 자식이 재정의한 메서드를 실행
		
		    
	}
	
	
	//toString() 오버라이딩 확인 예제
	
	public void ex4() {
		
		
		Person p = new Person("김철수", 17, "한국");
		
		System.out.println(p.toString());
		System.out.println(p);
		
		// print 구문 수행시 원래 변수명을 부르면 주소값이 나와야되는데
		// p만 적어도 자동으로 toString() 값을 실행시켜준다
		
		System.out.println("=====================================================");
		
		Student std = new Student("이백점", 17, "미국", 2 ,6 );
		
		System.out.println(std.toString());
		
		Employee emp = new Employee("김노동", 30, "일본", "삼성");
		
		System.out.println(emp);
		
		
		
	}
	
}
