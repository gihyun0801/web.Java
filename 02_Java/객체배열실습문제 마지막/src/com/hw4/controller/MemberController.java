package com.hw4.controller;

import com.hw4.model.vo.Member.Member;

public class MemberController {
      
	  public static int SIZE = 10; // 최대 회원 수 = 10;
	  
	  
	  private int memberCount = 0; //현재 회원수 
	  private Member[] mem = new Member[SIZE]; // 회원 객체 배열
	  
	  public int getMemberCount() {
		  
		  if(memberCount > mem.length) {
			  return -1;
		  }
		  
		  
		  return 1;
	  }
	  
	  public Member[] getMem() {
		  return members;
	  }
	  
	  public Member checkId(String userId) {
		  
	  }
	  
	  public void insertMember(Member m) {
		  
	  };
	  
	  public Member serachMember(int memu, String serach) {
		  
	  }
	  
	  public void updateMember(Member m, int menu, String update) {
		  
	  }
	  
	  public void deleteMember(String userId) {
		  
	  }
	  
	  public Member[] sortldAsc() {
		  
	  }
	  
	  public Member[] sortldDesc() {
		  
	  }
	  
	  public Member[] sortAgeAsc() {
		  
	  }
	  
	  public Member[] sortAgeDesc() {
		  
	  }
	  
	  public Member[] sortGenderDesc() {
		  
	  }
	  
	  
	  
	  
}
