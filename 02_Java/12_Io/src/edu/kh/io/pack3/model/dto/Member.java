package edu.kh.io.pack3.model.dto;

import java.io.Serializable;

// 직렬화 (Serializable) : 객체를 직선형태로 변형

// 직렬화 방법 > Serializable 인터페이스를 상속 받으면 끝

// Serializable 인터페이스는
// - 추상메서드가 하나도 없는 인터페이스
// - 상속만 받아도 입/출력 시 직렬화가 가능하다는 의미만 제공
// -> 마커 인터페이스 =  상속만 받았다
// 원래 직렬화 식별 번호가 있어야 된다
// serialVersionID : 직렬화 식별 번호

// -> 식별 번호는 역직렬화, 직렬화 할때 같은 객체가 맞는지 확인하는 아이디라고 생각하면 된다
// 근데 식별 번호는 별도로 작성하지 않으면 jvm이 알아서 지정

public class Member implements Serializable{
  private String Id;
  private String Pw;
  private String name;
  private int age;
  
  public Member() {
}

  
  
@Override
public String toString() {
	return "Member [Id=" + Id + ", Pw=" + Pw + ", name=" + name + ", age=" + age + "]";
}



public Member(String id, String pw, String name, int age) {
	super();
	Id = id;
	Pw = pw;
	this.name = name;
	this.age = age;
}

public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getPw() {
	return Pw;
}

public void setPw(String pw) {
	Pw = pw;
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


  
  
}
