package edu.kh.variable.ex2;

import java.util.Scanner;

//import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
//import : java.util.Scanner : java util 패키지에서 Scanner 설계도를 수입해온다.

// 자바 .util 에 설계도가 있으니까 그걸 가져왔다 라는 뜻이다 설계도없이는 class 내부에서 쓸수없기
//때문에

public class ScannerExample {
  
	public static void main(String[] args) {
		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		//Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만드는 것
		
		Scanner sc = new Scanner(System.in);
		// 오류 원인 -> 만들고 싶은데 설계도(class)가 존재하지 않는다 
//		 1.설계도를 수입해오고 2. 설계도를 만든다.
		
		System.out.println("정수 1 입력 :  ");
		
		int input1 = sc.nextInt(); //입력받은 정수를 input1 변수에 대입
		//nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1+ input2);
		
		
	}
	
}
