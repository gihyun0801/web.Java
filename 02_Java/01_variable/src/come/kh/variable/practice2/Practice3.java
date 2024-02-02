package come.kh.variable.practice2;

import java.util.Scanner;

public class Practice3 {
   public void ex2() {
	   
	   Scanner sr = new Scanner(System.in);
	   
	   System.out.print("국어 점수 : ");
	   double num1 = sr.nextDouble();
	   
	   System.out.print("영어 점수 : ");
	   double num2 = sr.nextDouble();
	   
	   System.out.print("수학 점수 : ");
	   double num3 = sr.nextDouble();
	   
	   System.out.printf("국어점수 %f 점 영어점수 %f  점 수학점수 점 %f = 총점 = %d 평균 = %d",
			              num1, num2, num3, (int)(num1+num2+num3), (int)(num1+num2+num3) /3);
	 
   }

   public void ex3() {
	   // sc.next() 와 sc.nextline()의 차이
	   
	   //안녕 하세요
	   //next() : 띄어쓰기 입력 불가,띄어쓰기를 구분인자로 생각하여 각각저장, 
	   //nextLine() : 문자열에 띄어쓰기 가능, 줄구분까지 저장
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("문자열 입력 1 : ");
	   
	   String input1 = sc.nextLine();
	   
	   System.out.print("문자열 입력 2 : ");
	   
	   String input2 = sc.next();
	   
	   System.out.println(input1);
	   System.out.println(input2);
	   
	   
   }
   
   
   public void ex4() {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("정수 입력 : ");
	   int input1 = sc.nextInt();
	   System.out.println(input1);
	   
	   sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
	   
	   System.out.print("문자열 입력");
	   String input2 = sc.nextLine();
	   System.out.println(input2);
	   
	   
   }
   
}
