package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	/* while 문
	 * 
	 * 
	 * -별도의 초기식, 증감식이 존재하지 않고
	 * 반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 * 
	 * ** 확실히 언제 반복이 끝날지는 모르지만
	 *    언젠가 반복 조건이 false 가 되는 경우 반복을 종료함
	 *    
	 *    [작성법]
	 *    while(조건식){
	 *       조건식이 true일 때 반복 수행할 구문
	 *       
	 *    
	 *    }
	 * 
	 * 
	 * */
	
	public void ex1 () {
		Scanner sc = new Scanner(System.in);
		
		int input = 9;
		
		while( input != 0) {
		
			
			System.out.println("---메뉴선택----");
			System.out.println("1. 떡볶이");
			System.out.println("2. 치킨");
			System.out.println("3. 과자");
			System.out.println("4. 피자");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이를 주문했습니다");
			break;
			case 2 : System.out.println("치킨을 주문했습니다");
			break;
			case 3 : System.out.println("과자를 주문했습니다");
			break;
			case 4 : System.out.println("피자 주문했습니다");
			break;
			case 0 : System.out.println("종료");
			break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void ex2() {
		//입력되는 모든 정수의 합 구하기
		//단 0이 입력되면 반복 종료 후 결과 출력
		// -> 0이 입력되지 않으면 계속 반복
		
		/*
		 * do{
		 *   반복 수행할 코드
		 *   -> 무조건 한번은 실행
		 * 
		 * } while(조건식)
		 * 
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int result = 0;
		
		do {
			
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			result += input;
			
			
		}while(input != 0);
		
		System.out.printf("정수의 합계는 : %d", result);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	//xx
}


