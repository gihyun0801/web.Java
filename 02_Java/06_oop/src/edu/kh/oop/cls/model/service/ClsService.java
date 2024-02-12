package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService extends Student{
                        //부모 Student를 상속받음;
	public void ex1() {
		//클래스 접근 제한자 확인하기
		
		Student std = new Student();
		//public class 는 import가 가능하다
		
		
//		TestVO test = new TestVO();
//      (default) class 인 TestVO는 import 불가(다른패키지)
		
		
		System.out.println(std.v1);
		System.out.println(std.v2);
		System.out.println(std.v3);
		System.out.println(std.v4);
		
		//상속 관계에서 직접 접근 가능 범위
//		System.out.println(v1);
//		System.out.println(v2);
//		System.out.println(v3);
//		System.out.println(v4);
	}
	
	public void ex2() {
		
	   //static 필드 확인 예제
		
	   //학생 객체 2개 생성
		Student std1 = new Student();	
	    Student std2 = new Student();
	    
	   //학생 객체에 name 세팅
	     
	    std1.setName("홍길동");
	   std2.setName("김영희");
		
	   System.out.println(std1.schoolName);
	   // schoolName에 노란줄이 뜨는 이유 (경고)
//	   ==> 제대로 작성을 안해서
	   
	   // *** static이 붙은 필드(변수)는 "클래스명. 변수명"
//	   으로 사용함 //
	   
	   System.out.println(Student.schoolName);
		
	   Student.schoolName = "kh정보교육원";
	   
	   System.out.println(std1.schoolName);
	   System.out.println(std2.schoolName);
		
		
	}
	
	public void ex3() {
		//생성자 확인 테스트
		
		// User 기본 생성자를 이용해서 객체 생성
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		
		User u2 = new User();
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		// 문제점 : u1 이 참조하고 있는 user 객체와
//		            u2 가 참조하고있는 user 객체의 필드값이 모두 동일함
		//같은 기본 생성자로 user 객체를 생성했기 때문에
		
		
		// 해결 방법 1 : setter를 이용해서 새로운 값 대입
		
		u2.setUserName("야야야");
		u2.setUserPw("2323");
		

		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		
		//해결 방법 2 : 매개변수 생성자를 이용해서
//		              객체가 생성될 때 부터 다른값으로 필드를 초기화
		
		User u3 = new User("test3", "dmsgktn3032");// 매개변수 생성자
		   //생성자 수행시 전달한 값을 작성 (전달할 값 꼭 지켜야됨)
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		
		
		
		
	}
	
	
	public void ex4() {
		
		
		User u1 = new User(); //기본
		User u2 = new User("user02", "pass02"); //매개변수 2개 생성자
		User u3 = new User("gihyun080","rlgus","성기현",25,'남'); // 매개변수 5개 생성자
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", u1.getUserId(), u1.getUserPw(), u1.getUserName(), u1.getUserAge(), u1.getUserGender());
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", u2.getUserId(), u2.getUserPw(), u2.getUserName(), u2.getUserAge(), u2.getUserGender());
		System.out.printf("u3 : %s / %s / %s / %d / %c\n", u3.getUserId(), u3.getUserPw(), u3.getUserName(), u3.getUserAge(), u3.getUserGender());
		
		
		
		
		
	}
}
