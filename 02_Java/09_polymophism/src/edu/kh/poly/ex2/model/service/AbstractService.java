package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractService {
    
	public void ex1() {
		
//		Animal al = new Animal();
		// Animal은 추상클래스이기 때문에 객체화 할수 없다
		
		//클래스 : 객체의 속성, 기능을 정의한 것
		//추상 클래스 : 미완성 메서드를 포함한 클래스
		//미완성 클래스는 객체를 만들 수 없다
		
		
		//Animal을 상속받아 미완성 부분을 구현한
		//클래스를 이용해 객체 생성
		
		//추상클래스를 상속받은 자식 객체 생성
		
		Person p1 = new Person();
		
		p1.setName("홍길동");
		
		//상속 받은 기능 호출
		
		p1.setType("척추동물");
		p1.setEatType("잡식");
		
		p1.eat();
		p1.breath();
		p1.move();
		
		Fish f1 = new Fish();
		
		f1.eat();
		f1.breath();
		f1.move();
		
	}
	
	
	public void ex2() {
		
		//추상클래스와 다형성 + 바인딩
		
		//추상클래스는 객체로 만들수 없다!!!
		// --> 하지만 "참조 변수"로는 사용할 수 있다
		
//		Animal a1 = new Animal();
		
		// 사람 -> 동물 / 물고기 -> 동물
//		Animal a1 = new Person();
//		Animal a2 = new Fish();
		
		Animal[] arr = new Animal[2];
		arr[0] = new Person("사람", "잡식", "김사람");
//		Animal 부모 = person 자식 (다형성 중 업캐스팅)
		
		arr[1] = new Fish("물고기", "잡식");
		
		//바인딩 확인
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].eat();
			arr[i].breath();
			System.out.println(arr[i].toString());
		}
		
		System.out.println("===========================");
		
		//프로그램실행 시
		//참조하고 있는 자식 객체의 오버라이딩된 eat(), breath(), toString()
		//메서드 수행
		// 동적 바인딩 : 부모타입 참조변수로 메소드를 호출하였지만
		                  //자식 타입의 오버라이딩된 메소드가 수행된다
		
		
		
		
		
	}
	
}
