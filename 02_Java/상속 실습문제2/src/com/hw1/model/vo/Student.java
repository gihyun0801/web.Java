package com.hw1.model.vo;

import com.hw1.run.Run.Run;

public class Student extends Person{
    
	private int grade;
	private String major;
	
	
	
	

	
	
	
	public Student() {
		
		
	}
	
	
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		
		super(age, height, weight);
		this.name = name; //person의 name : proteceted 는 후손 클래스한테 값을 주기위해 쓰는것이다.
		this.grade = grade;
		this.major = major;
		
		
	}
	
	@Override
	public String information() {
		
		return super.information() + String.format(" / 학년 : %d / 전공 : %s", grade,major);
		
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
	
	
}
