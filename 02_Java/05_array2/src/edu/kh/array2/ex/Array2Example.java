package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {

	public void lotto() {
		
		int[] arr = new int[6];
		
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)Math.floor(Math.random() * 6 + 1);
			
			
			arr[i] = random;
			
			for(int x = 0; x < i; x++) {
				
				if(arr[i] == random) {
					
				}
				
			}
			
			
		}
		
		
		
	}
	
/* 2차원 배열
 * 
 * 
 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
 * -> 행, 열 개념 추가
 * 
 * 
 * */	
	
	public void ex1() {
		
		// 2차원 배열 선언
		
		int[][] arr;
		// int arr[][]
		// int [] arr[]
		// --> int 2차원 배열을 참조하는 참조변수 arr 선언
		// 참조변수 == 참조형 == 래퍼런스 변수 == 래퍼런스
		
		// 2차원 배열 할당
		// -> new 자료형 [행][열]
		
		
		arr = new int[2][3];
		// 힙 영역에 2행 3열 짜리 공간을 할당
		
		// 2차원 배열 초기화
		// 1) 행, 열 인덱스를 이용해서 직접 초기화
		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		
//		arr[1][0] = 40;
//		arr[1][1] = 50;
//		arr[1][2] = 60;
		
		// 2) 2중 for문을 이용한 초기화
		int num = 10; // 배열 요소 초기화에 사용할 변수
		
		// 배열길이
		// -> 배열명.length 는 변수가 직접 참조하고 있는 배열의 길이를 반환
		
		
		System.out.println(arr.length); // 2 //arr.length = 행의 길이;
		
		
		
		for(int row = 0; row < arr.length; row++) 
		{// 행 반복(0,1)
			
			for(int col = 0; col < arr[row].length; col++) {
				
				arr[row][col] = num;
				num += 10;
			}
			
		}
		
		//Arrays.toString(배열명)
		
		System.out.println(Arrays.toString(arr)); //이렇게 작성하면 참조하고 잇는
		//1차열 배열값을 반환해준다
		
		//2차원 배열일때는 Arrays.deepToString(배열명) 이렇게 작성하면 된다
		
		System.out.println(Arrays.deepToString(arr));
		
		
	}
	
	public void ex2() {
		
		// 2차원 배열 선언과 동시에 초기화하기 
	    // 3행 3열짜리 정수형 2차원 배열 선언과 동시에
		// 1 ~ 9 까지 초기화
		
//	    int[] arr = {1,2,3,4,5};
		
		int[][] arr = { {1,2,3},
						{4,5,6},
						{7,8,9}  
						};
		
		// 행 별로 합 출력
		// 0행의 합 : 6
		// 1행의 합 : 15
		// 2행의 합 : 24

		
		
		
		for(int row = 0; row < arr.length; row++) {
			int result = 0;
			
			for(int col = 0; col < arr[row].length; col++) {
				
				result += arr[row][col];
				
			}
			
			System.out.println(row + "행의 합" + " = " + result);
			
		}
		
		int count = 0;
		
		
		for(int row = 0; row < arr.length; row++) {
			int sha = 0;
			
			for(int col = 0; col < arr[row].length; col++) {
				
				sha += arr[col][count];
				
			}
			
			count++;
			System.out.println("열 별로 합계의 값 : " +  sha);
		
			
		}
		
	

		 
		
	
		
		
		
		
	}
	
	public void ex3() {
		
		//가변 배열
		//- 2차원 배열 생성시 마지막 배열 차수(열)을 지정하지 않고
		// 나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
		
		char[][] arr = new char[4][];
		
		arr[0] = new char[3]; //0행에 3열짜리 1차원 배열을
//		생성하여 주소값 저장
		
		arr[1] = new char[4]; //1행에 4열짜리 1차원 배열을 생성하여 주소값 저장
		arr[2] = new char[5]; //1행에 5열짜리 1차원 배열을 생성하여 주소값 저장
		arr[3] = new char[2]; //1행에 2열짜리 1차원 배열을 생성하여 주소값 저장
		
		char ch = 'a';
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col <arr[row].length; col++) {
				
				arr[row][col] = ch++;
				
			}
			
			
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
	
	
	
	
	//xxxx
}



















