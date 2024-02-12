package edu.kh.oop.abstraction.model.vo;


// VO(value Object) : 값 저장용 객체를 만들기 위한 클래스틀 모아두는 패키지
public class People {
	
	// 클래스란? 객체의 특성(속성, 기능)을 정의한 것
	// == 객체를 만들기 위한 설계도
	
	// 속성 == 값 == data
	// 값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	// 이름, 성별, 주민번호, 주소, 전화번호, 나이
	
	// 필드 == 필드변수 == 맴버변수 == 클래스 변수
	
	//캡슐화
	//- 데이터와 기능을 하나로 묶어서 관리하는 기법
	//- 데이터의 직접적인 접근을 제한 하는것이 원칙이다.
	//-> 직접접근을 못하기 때문에
	// 클래스 내부에 간접 접근 방법을 제공하는 기능을 작성해둔다
	// -> 빨대역할의 getter/setter
	
//	public == 접근제한자
// ** 데이터 직접 접근 제한 ***
// public(공공의) -> private(사적인, 개인적인) 변경
	private String name; 
	private char gender;
	private String pNo;// "23242-2502020";
	private String address;
	private String phone; //010-64564-48648;
	private int age;
	//public double bitcoin; // 공통점이 아니므로 제거
	
    
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setPno(String pNo) {
		this.pNo = pNo;
	}
	
	public String getpNo() {
		return pNo;
	}
	
	public void setAdderss(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	
	
	
	
	

}
