package com.hw1.run.Run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend.Friend;

public class Run {
	
	private List<Friend> friendList = new ArrayList<Friend>();
	public Run() {
		friendList.add(new Friend("짱구"));
		friendList.add(new Friend("철수"));
		friendList.add(new Friend("유리"));
		friendList.add(new Friend("훈이"));
		friendList.add(new Friend("맹구"));
		
	
		
		
	}
	int random = (int)(Math.floor(Math.random() * 5));

    
	public void ya() {
		
		
		
		System.out.println(friendList.get(random));
		
	}
	
	

}
