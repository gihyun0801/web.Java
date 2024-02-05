package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	/*for 문
	 * - 끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식){
	 *  조건식이 true 라면 반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for 문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정한느 식
	 *         보통 초기식에 사용된 변수를 이용하여 조건식을 작성함.
	 *         
	 *  - 증감식 : 초기식에 사용된 변수를
	 *     		for문이 끝날 때 마다 증가 또는 감소시켜
	 *      	조건식의 결과를 변하게 하는 식
	 *             
	 * 
	 * 
	 * */
	
	public void ex1() {
		for(int i = 0; i <= 10; i ++) {
			System.out.println(i);
		}
	}
	
	public void ex2() {
		//1부터 입력받은수까지 1씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 번호 : ");
		
		
	   int result = sc.nextInt();
	   
	   for(int i = 1; i <= result; i++) {
		 
		   
		   System.out.println(i);
		   
	   }
	   
	}
	
	public void ex3() {
		
		Scanner sr = new Scanner(System.in);
		
		//;
		
		
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		String result = "";
		
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
    
	public void ex4() {
		// 정수 5개를 입력 받아서 합계 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		for(int i = 1; i <= 5; i ++) {
			System.out.printf("입력 : " + i + " : ");
			int num = sc.nextInt();
			
			result += num;
		}
		
		System.out.printf("합계 : " + result);
		
		
		
		
	}
	
	public void ex5() {
		
		//1부터 20까지 1씩 증가하면서 출력
		//단, 입력받은 수의 배수는 양쪽에 () 표시
		Scanner sr = new Scanner(System.in);
		
		System.out.print("괄호에 표시할 수 : ");
		int num = sr.nextInt();
		String result = 0;
		
		for(int i = 1; i <= 20; i++) {
			
			if(num % i == 0) {
				result += " + (" + i + ") +";
			}else {
				result += i + " ";
			}
			
			
			
		}
		
		System.out.println(result);
		
	}
   
	
	public void ex6() {
		//[구구단 출력]
		//2 ~ 9 사이 수를 하나 입력받아
		//해당 단을 출력
		
		Scanner sr = new Scanner(System.in);
		
		
		System.out.print("단 입력 : ");
		int dan = sr.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			
			for(int i =1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
			
		}else {
			
			
		      System.out.println("잘못 입력");
		
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
public void ex7() {
		//구구단 모두 출력하기
	

		
		for(int i = 2; i <= 9; i++) {
		
			for(int k = 1; k <= 9; k++) {
				
				System.out.printf("%d X %d = %d", i, k, i * k);
				
				
			}
			System.out.println("");
			
		}
		System.out.println("==========================================================================================================");
		
		for(int i = 9; i >= 2; i--) {
			String result = "";
			for(int k = 1; k <= 9; k++) {
				
				result += i + " X " + k + " = " + i * k + "  ";
				
				
			}
			System.out.println(result);
			
		}
		
		
	    
	}


public void ex8() {
	
	//숫자 세기 count
	
	//1부터 20까지 1씩 증가하면서
	//입력받은 수의 배수의 총 개수 출력
	//입력받은 수의 배수의 합계 출력
	
	
	//배수 입력 : 3
	// 3 6 9 12 15 18 : 6개
	// 3의 배수 합계 : 63
	Scanner sr = new Scanner(System.in);
	
	System.out.print("배수 입력 : ");
	
	int num = sr.nextInt();
	
	String result = "";
	int sha = 0;
	int count = 0;
	
	for(int i = 1; i <= 20; i++) {
		
		if(i % num == 0) { 
			result += i + " ";
			sha += i;
			count ++;
		}
		
		
	}
	
	System.out.printf("%s :  %d\n", result, count);
	System.out.printf("%d 의배수 합계 : %d", num, sha);
	
	
	
	
	
	
	
	
	
}

}
