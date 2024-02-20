package com.hw1.model.dto.Friend;

public class Friend {
   
	private String name;
	public Friend() {};
	public Friend(String name) {
		this.name = name;
	}
	
	
	public void pickLeader() {
		System.out.println(name + "가 골목대장이다!!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
