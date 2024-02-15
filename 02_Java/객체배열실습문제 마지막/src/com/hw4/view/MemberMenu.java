package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;

public class MemberMenu {
     
	 Scanner sc = new Scanner(System.in);
	 
	 MemberController memberController = new MemberController();

	
	 private MemberController mc = new MemberController();
	 
	 
	
	public void mainMenu() {
		
		int num = 0;
		
		do {
			
			System.out.println("===회원 관리 메뉴===");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("0. 프로그램 종료");
			
			System.out.println();
			
			System.out.println("메뉴를 고르세요");
			
			num = sc.nextInt();
			
			switch(num) {
			case 1: 
				
				insertMember();
				
				break;
			     
			
			
			
			case 2: 
				
				serachMember();
				
				break;
			
			case 3: 
				
				updateMember();
				
				
				break;
			
			case 4: 
				
				deleteMember();
				
				
				
				break;
			
			case 5: 
				
				
				printAllMember();
				
				break;
			
			case 6: 
				
				sortMember();
				
				
				break;
			
			case 0: 
				
				System.out.println("프로그램 종료");
				
				break;
				
				
			default: System.out.println("숫자를 입력해주세요");
			break;
			
			
			
			}
			
			
			
			
			
		}while(num != 0);
		
		
		
		
	}
	
	public void insertMember() {
		
		//1.현재 회원수가 최대 회원 수를 넘어설 경우 return 처리
		
		int result = memberController.getMemberCount();
		
		if(result == 1) {
			System.out.println("회원가입이 완료되었습니다");
			
			
		}else {
			System.out.println("자리가 꽉찻습니다");
		}
		
		
		
		
		
		
	}
	
	public void serachMember() {
		
	}
		
	
	
	public void updateMember() {
		
	}
	
	public void deleteMember() {
		
	}
	
	
	public void printAllMember() {
		
	}
	
	public void sortMember() {
		
	}
	
	
	
	
	
	
}
