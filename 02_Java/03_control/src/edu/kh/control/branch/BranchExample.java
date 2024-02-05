package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	
	public void ex1() {
		//1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		//단, 5를 출력하면 반복문 종료
		//1 2 3 4 5
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if(i == 5) {
				break;
			}
			
			
		}
		
		
		
		
	}
    
	public void ex2() {
		
		// 입력받은 모든 문자열을 누적
		// 단, "exit@" 입력시 문자열 누적을 종료하고 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String str = "";
		
        while(true) {
        	
        	System.out.println("exit@ 를 입력시 종료합니다");
        	String arr = sc.nextLine();
        	
        	if(arr.equals("exit@")) {
        		//String 자료형은 비교연산자로 같은 문자열인지 판별할 수 없다
        		//비교연산자는 보통 자료형끼리의 연산에서만 사용 가능함
        		// -> String 은 기본자료형이 아닌 참조형
        		
        		
        		System.out.println();
        	};
        	
        	str += arr + "\n";
        }
		

		
		
		
		
		
	}
     
	
	public void ex3() {
		//continue : 다음 반복으로 넘어감
		
		// 1~10까지 1씩 증가하며 출력
		// 단, 3의 배수 제외
		
	
		
	
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 3 ==0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		
		
		
	}
	
	
	public void ex4() {
		//1 ~ 100 까지 1씩 증가하며 출력하는 반복문
		//단 , 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을때 반복을 멈춤
		
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
		
			
			if(i == 40) {
				break;
			}
			
			System.out.print(i + " ");
			
			if(i % 5 == 0) {
				continue;
			};
			
		}
		
		
			
			
			
		
		
	}
	
	
	public void RSPGame() {
		
		
		//가위바위보 게임
		//몇 판 할지 입력받음
		//입력받은 판 수 만큼 반복
		//컴퓨터 : Math.random() 0 ~ 1 미만 난수생성
		// 1) 1~3 사이 난수 생성
		// 2) 1 이면 가위, 2이면 바위, 3이면 보 지정(switch)
		// 컴퓨터와 플레이어 가위바위보 판별
		// 플레이어 승! 졌습니다 ㅠㅠ
		// 매 판마다 끝나면 현재 기록 : 2승 1무 0패 이런식으로 출력
		
		
		
    		
		Scanner sc = new Scanner(System.in);
		
		int bigim = 0;
		int egim = 0;
		int jim = 0;
		
		
		System.out.print("몇 판 하시겠습니까? : ");
		
		int pan = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("\n\n");
		
		String str = "";
		

		
		for(int i = 1; i <= pan; i++) {
			
			int random = (int)Math.floor(Math.random() * 3 + 1);
			
		    System.out.println(i + "번 째 게임");
			System.out.print("무엇을 내겠습니까? : ");
			String sha = sc.nextLine();
			
		
			
			
			
			switch(random) {
			   
			case 1 : str = "가위"; //가위
			break;
			
			case 2 : str = "바위";//바위
			break;
			
			case 3 : str = "보";//보
			break;
			
			default:
				break;
			
			}
			
			System.out.printf("컴퓨터는 %s 를 선택했습니다\n", str);
			
			if(sha.equals(str)) {
				System.out.println("비겼습니다");
				bigim++;
			}else if(sha.equals("가위") && str.equals("바위")) {
				System.out.println("졌습니다");
				jim++;
			}else if(sha.equals("바위") && str.equals("가위")) {
				System.out.println("이겼습니다");
				egim++;
			}else if(sha.equals("가위") && str.equals("보")) {
				System.out.println("이겼습니다");
				egim++;
			}else if(sha.equals("바위") && str.equals("보")) {
				System.out.println("졌습니다");
				jim++;
			}else if(sha.equals("보") && str.equals("가위")) {
				System.out.println("졌습니다");
				jim++;
			}else if(sha.equals("보") && str.equals("바위")) {
				System.out.println("이겼습니다");
				egim++;
			}
			
			
			
			System.out.printf("%d승 %d무 %d패\n", egim, bigim, jim);
			System.out.println("==========================================================");
			
			
			
			
		}
		
		
		
	}
	
	//xx
}
