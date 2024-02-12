package edu.kh.gihyun.vo.service;

import edu.kh.gihyun.vo.Vo;

public class Service{
	
	public void ex1() {
		Vo sr = new Vo(25);
		
	
		
		System.out.println(sr.getAge());
		
	}
	
	
	public void ex2() {
		Vo sr2 = new Vo();
		sr2.setAge(100);
		
		System.out.println(sr2.getAge());
		
		
	}
	
	
}
