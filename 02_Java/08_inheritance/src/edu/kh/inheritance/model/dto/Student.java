package edu.kh.inheritance.model.dto;

/*
 *   Object << 최상위 객체
 *      ㅣ
 *          Person   << extends 로 부모
 *            ㅣ
 *               Student
 * 
 * 
 * */



public class Student extends Person{
	//Student 클래스에 Person 내용(필드, 메서드) 속성 기능 들을 받아온다
	

	 // 필드
	
//	 private String name;
//	 private int age;
//	 private String nationality;
	 private int grade; //학년
	 private int classRoom;  //반
	 
	 
	 public Student() {
		 
	}


	public Student(String name, int age, String nationality, int grade, int classRoom) {
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
		super(name, age, nationality); // 부모의 기본생성자를 가르킴
		
		
		
		
		this.grade = grade;
		this.classRoom = classRoom;
	}


//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//
//	public String getNationality() {
//		return nationality;
//	}
//
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassRoom() {
		return classRoom;
	}


	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	 
	 @Override
		public String toString() {
			return super.toString() + " / " + grade + " / "  +classRoom;
		}
	 
	
}
