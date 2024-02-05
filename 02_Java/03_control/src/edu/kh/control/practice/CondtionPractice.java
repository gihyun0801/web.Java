package edu.kh.control.practice;

import java.util.Scanner;

public class CondtionPractice {
     
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0 입니다");
		}else if(num < 0) {
			System.out.println("양수만 입력해주세요.");
		}else if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		
	}
	
	
	

	
	public void practice2() {
		
		System.out.print("국어 점수 : ");	
		int guk = sc.nextInt();
		
		System.out.print("영어 점수 : ");	
		int eng = sc.nextInt();
		
	    System.out.print("수학 점수 : ");	
	    int math = sc.nextInt();
	    
	    System.out.printf("국어 : %d 점\n", guk);
	    System.out.printf("영어 : %d 점\n", eng);
	    System.out.printf("수학 : %d 점\n", math);
	    
	    if((math >= 40) && (guk >= 40) && (eng >= 40) && (guk + math + eng) / 3 >= 60) {
	    	System.out.println("축하합니다, 합격입니다!");
	    }else {
	    	System.out.println("불합격입니다.");
	    }
		
		
	}
	
	
	public void practice3() {
		
		System.out.println("달을 입력하세요");
		
		int month = sc.nextInt();
		
		String blo = "";
		
		switch(month) {
		case 1 , 3, 5 , 7, 8, 10, 12: blo += month + "월은 31일 까지 있습니다";
		break;
		
		case 2 : blo += month + "월은 28일 까지 있습니다";
		break;
		
		case 4, 6, 9, 11 : blo += month + "월은 30일까지 있습니다";
		break;
		
		default:
		System.out.println("1~12 사이 숫자를 입력해주세요");
		break;
		
		
		
		
		
		
		}
		
		System.out.println(blo);
		
	}
	
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double tail = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double body = sc.nextDouble();
		
		String bmi = "";
	   
		
		if(body / (tail * tail) < 18.5 ){
			bmi += "저체중";
		}else if(body / (tail * tail) >= 18.5 && body / (tail * tail) < 23) {
			bmi += "정상체중";
		}else if(body / (tail * tail) >= 23 && body / (tail * tail) < 25) {
			bmi += "과체중";
		}else if(body / (tail * tail) >= 25 && body / (tail * tail) < 30) {
			bmi += "비만";
		}else if(body / (tail * tail) >= 30) {
			bmi += "고도 비만";
		}
		
		System.out.printf("BMI 지수 : %f\n", body / (tail * tail));
		System.out.println(bmi);
		
	}
	
	public void practice5() {
		
	System.out.print("중간 고사 점수 : ");
	double jung = sc.nextDouble();
	
	System.out.print("기말 고사 점수 : ");
	double gimal = sc.nextDouble();
	
	System.out.print("과제 점수 : ");
	double project = sc.nextDouble();
	
	System.out.print("출석 횟수 : ");
	double in = sc.nextDouble();
	
	System.out.printf("중간 고사 점수(20) : %.1f\n", 100 * (jung * 0.01) * 0.2);
	System.out.printf("기말 고사 점수(30) : %.1f\n", 100 * (gimal * 0.01) * 0.3);
	System.out.printf("과제 점수(30) : %.1f\n", 100 * (project * 0.01) * 0.3);
	System.out.printf("출석 점수(20) : %.1f\n", 100 * ((in * 5) * 0.01) * 0.2);
	System.out.printf("총점 : %.1f\n", (100 * (jung * 0.01) * 0.2) + (100 * (gimal * 0.01) * 0.3)
									+ (100 * (project * 0.01) * 0.3) + (100 * ((in * 5) * 0.01) * 0.2));
	
	double result = (100 * (jung * 0.01) * 0.2) + (100 * (gimal * 0.01) * 0.3)
			+ (100 * (project * 0.01) * 0.3) + (100 * ((in * 5) * 0.01) * 0.2);
	
	if(result >= 70) {
		System.out.println("pass");
	}else if(result < 70 || in <= 14) {
		System.out.println("Fail [점수 미달]");
	}
	
		
		
	}
	
	
	
	//넘지마
}
