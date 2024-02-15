package edu.kh.inheritance.model.dto;


//Vo 보다 DTO 를 더 많이 사용한다

//DTO ( Data Transfer Object) : 비지니스 계층과 데이터교환을 위해 사용하는 객체.

//지금까지 만들엇던 Service 클래스가 == 비지니스 계층

public class Person /*extends Object*/{
	// Object 클래스
	// - 모든 클래스의 최상위 부모
	// - class 선언부에 상속 구문이 하나도 작성되어있지 않다면
	// 컴파일러가 extends Object 구문을 추가해준다.
    
	//필드
	
    private String name;
    private int age;
    private String nationality;
    
	
	
	
	
	//기능(메서드 + 생성자)
    
    public Person() {
    	
    }
    
    public Person(String name, int age, String nationality) {
    	super();
    	this.name = name;
    	this.age = age;
    	this.nationality = nationality;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
    public void breath() {
    	System.out.println("사람은 코나 입으로 숨을 쉰다");
    }
    
    public void move() {
    	System.out.println("사람은 움직일 수 있다");
    	
    }

	@Override
	public String toString() {
		//object의 tostring 메서드를 재정의 하는중이다.
		
		
		
		
		return name + " / " + age + " / " + nationality;
	}
    
    
    
	
}
