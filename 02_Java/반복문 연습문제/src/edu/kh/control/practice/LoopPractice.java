package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 넣어 : " );
		int num = sc.nextInt();
	
		
		for(int i = 1; i <= num; i++) {
			
			System.out.print(i + " ");
			
			
			
		}
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
		
	}
	
	
	public void practice2() {
		
		Scanner sr = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sr.nextInt();
		
		sr.nextLine();
		
		
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.printf("%d ", i);
			}
		}else {
			System.out.println("숫자는 1보다 크거나 같아야합니다");
		}
		
		
	}
}
