package edu.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public void ex1() {
		
		int[] arr = new int[9];
		
		
		int result = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			 arr[i] = i + 1;
			 
		
		}
		
		for(int k = 0; k < 5; k++) {
			
			
			
			result += arr[k  + count];
			count++;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.print(result);
	
		
		
		
		
	}
    
	
	public void ex2() {
		int[] arr = new int[9];
		
		int count = 0;
		int result = 0;
		int good = 0;
		
		for(int i = arr.length; i > 0; i--) {
			arr[count] = i;
			count++;
		}
		for(int k = 0; k < 4; k++) {
			good++;
			result += arr[good + k];
			
		}
		
	
		System.out.println(Arrays.toString(arr));
		System.out.println(result);
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
    
	public void ex4() {
		
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("입력 : %d : ", i);
			int num = sr.nextInt();
			
			arr[i] = num;
		}
		System.out.print("검색할 값 : ");
		int search = sr.nextInt();
		boolean flag = false;
		String result = "인덱스 : ";
		
		for(int k = 0; k < arr.length; k++){
			
			  if(arr[k] == search) {
				
				  result += k;
				  flag = true;
			  }
			
		}
		
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
		if(flag) {
			System.out.println(result);
		}
		
		
	
		
	
		
		
		
		
	}
	
	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char str2 = sc.next().charAt(0);
		
		
		char[] arr = new char[str.length()];
		
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		String result = "";
		
		for(int k = 0; k < str.length(); k++) {
			
			if(arr[k] == str2) {
				count++;
				result += k + " ";
			}
			
		}
		
		System.out.printf("%s에 %s가 존재하는 위치 (인덱스) : %s\n", str, str2, result);
		System.out.printf("%s 개수 : %d",str2, count);
		
	}
	
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i );
			int number = sc.nextInt();
			
			arr[i] = number;
			result += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.printf("총 합 : %d", result);
		
	}
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			
		      arr[i] = str.charAt(i);
			
		}
		
		String result = "";
		
		System.out.println(Arrays.toString(arr));
		
		for(int k = 0; k < arr.length; k++) {
			  
			result += arr[k];
			
			for(int j = 8; j < arr.length; j++) {
				arr[j] = '*'; 
			}
			
		
		}
		System.out.println(result);
		
	}
	
	
	
	
	
}
