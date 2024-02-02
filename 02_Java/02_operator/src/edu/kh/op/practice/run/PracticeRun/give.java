package edu.kh.op.practice.run.PracticeRun;

import java.util.Scanner;

public class give {

	public void practice1() {
		Scanner sr = new Scanner(System.in);
		
		System.out.print("인원 수 :");
		int num1 = sr.nextInt();
		System.out.print("사탕 개수 :");
		int num2 = sr.nextInt();
		
		
		
	
		
		System.out.printf("1인당 사탕 개수 : %d\n", num2 / num1);
		System.out.printf("남은 사탕 개수 : %d\n", num2 % num1);
		
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String ch1 = sc.nextLine();

		System.out.print("학년 : ");
		int grade = sc.nextInt();

		System.out.print("반 : ");
		int classes = sc.nextInt();

		System.out.print("번호 : ");
		int number1 = sc.nextInt();

		sc.nextLine(); // 개행 문자 제거

		System.out.print("성별 : ");
		String gender = sc.nextLine();
		
		System.out.print("성적 : ");
		double jeomsu = sc.nextDouble();
		
		System.out.printf("%s학년 %d반 %d번 %s  %s의 성적은 %.2f이다." ,
				grade, classes,number1,ch1,gender,jeomsu);
		
		
	}
   
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int guk = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		String result = ((guk + eng + math) / 3 > 40) ? "합격" : "불합격";
		
		System.out.printf("합계 : %d\n", (guk + eng + math));
		System.out.printf("평균 : %.1f\n", (guk + eng + math) / 3.0);
		System.out.println(result);
		
		
		
		
		
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ? : " );
		int age = sc.nextInt();
		String str1 = (age >= 20) ? "저는 성인입니다" : "저는 미성년입니다";
		String str2 = (age >= 13 && age <= 19) ? "true" : "false";
		String str3 = (age >= 65 || age <= 12) ? "true" : "false";
		

		
		System.out.println(str1);
	    System.out.print("청소년 입니까? ");
	    System.out.println(str2);
	    System.out.print("노인이거나 어린이 입니까? ");
	    System.out.print(str3);
	    
		
		
		
		
		
	}
	
}
