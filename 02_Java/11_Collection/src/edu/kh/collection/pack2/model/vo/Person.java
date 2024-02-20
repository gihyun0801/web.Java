package edu.kh.collection.pack2.model.vo;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private char gender;
    
   
    
    
    //객체가 같다는걸 따져 줘야된다(동일, 동등)를 어떻게 비교할까?
    // - 동일 : 가르키고 있는 것이 같다 - 참조하고있는것이 같다
    // - 동등 : 값이 같음
    
    // 동일 비교 : hashcode 를 사용하는데 얘의 엄마는 Object
    
    //hash 함수 : 값을 넣으면 같은 길이의 문자열이 반환되는 함수
    
    // ex) 123 - > qwerty
    //   adafafafsad -> asdfgh
    //암호화에 많이 사용
    
    // hashCode() : 객체별 식별 코드(객체를 구분하는 정수 값)을 반환
    // ex) 주민등록번호 , 학번, 은행번호표
    
    
    //동일 비교 = 참조하는 것을 가르킴
    @Override
    public int hashCode() {
        //필드에 저장된 값을 이용해서 hashcode 생성
    	
    	//objects : Object 관련된 유용한 기능 모음
    	return Objects.hash(name, age, gender);
    }
    
    //동등 비교 = Object.equals()
    
    @Override
    public boolean equals(Object obj) {
    	// 현재 객체의 필드와 
    	// 전달받은 obj의 필드가 모두 같을 경우 true
    	// 아니면 false 반환
    	
    	if(obj == null) return false; //null 비교불가
    	
    	if(obj == this) return true; 
    	
    	if(!(obj instanceof Person)) return false;
    	
    	Person other = (Person)obj;
    	
    	return name.equals(other.name) && 
    			age == other.age && 
    			gender == other.gender;
    }
    
    
    
    public Person() {
		// TODO Auto-generated constructor stub
	}


	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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


	public char getGender() {
		return gender;
	}


	
	public void setGender(char gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
    
    
}
