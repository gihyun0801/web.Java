package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {

	/* 배열(Array)
	 *  - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 *  - 묶여진 변수들은 하나의 배열명으로 불러지고
	 *    구분은 index를 이용함 (index 는 0 부터 시작하는 정수)
	 * 
	 * 
	 * */
	
	public void ex1() {
		
		// 변수 vs 배열
		
		// 변수 선언
		int num;
		// statck 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num 이라는 이름을 부여
		
		
		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10 이라는 값을 대입
		
		// 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		//num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
	
		//-----------------------------------------------------
		
		//배열 선언
		
		int[] arr;
//		int arr[];
		//stack 영역에 int[] 자료형 공간을 4byte 할당하고
		//그 공간에 arr 이라는 이름을 부여
		//** 해당 변수는 참조형으로 주소값만을 저장할 수 있다.
		
		//배열 할당
		arr = new int[3];
		
		// new : "new"연산자 라고 하며
		// Heap 메모리 영역에 새로운 공간(배열, 객체)를 할당 
		
		//int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int 3칸짜리 int[] 을 생성(할당)
		           // ** 생성된 int[] 에는 시작 주소가 지정된다
		
		// arr = new int[3];
		// (int[])  (int[]) -> 같은 자료형 == 연산 가능
		
//		int [] arr2 = new double[5] << 이렇게 int하고 double은 다른 자료형이므로
//		사용 불가
		
		//heap 영역에 생성된 int[]의 시작주소를
		//stack영역에 생성된 arr 변수에 대입
		
		// -> arr 변수가 int[]을 참조하게됨
		// 그래서 arr 을 참조형이라고 함

		 //new int[3] 을 치면 Heap 영역에 저장됨
        
		//heap 영역에 할당된 공간은 절대 비어 있을수 없다
		 // 최초 할당 시 JVM 기본값이 자동 저장된다.
		//boolean 은 false 기본 자료형은 0; 참조형은 null
		
		
		System.out.println("arr의 주소값? : " + arr);
		
		//arr은 int[] 참조형 변수 지만
		//arr[0], arr[1], arr[2] 은 int 자료형이므로 변수 값을 대입할 수 있음
		
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public void ex2() {
		
		
		// 배열 선언 및 할당
		
		int[] arr = new int[4];
		
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		
		// 배열의 길이 (몇 칸 인가) :
		// 배열명.length
		
		System.out.println("배열의 길이 : " + arr.length);
		
		// 배열과 for문 
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
//		Scanner sr = new Scanner(System.in);
//		
//		System.out.print("입력 : ");
//		String str = sr.next();
//		
//		for(int i = 0; i < str.length(); i++) {
//			 System.out.printf("%s\n", str[i]);
//		}
		
		
		
		
	}
	
	
	public void ex3() {
		//5 명의 키(cm)를 입력받고 평균 구하기
		
		//1번 키 입력 : 170.5
		//2번 키 입력 : 165.7
		//3번 키 입력 : 184.3
		//4번 키 입력 : 190.2
		//5번 키 입력 : 174.4
		
		//평균 : 177.02 cm;
		
		Scanner sr = new Scanner(System.in);
		
double[] height = new double[5];
		
		for(int i = 0; i < height.length; i++) {
			System.out.printf("%d 번 키 입력 : ", i + 1);
			height[i] = sr.nextDouble();
		}
		
		
		
		// 합계 저장용 변수
		
		double sum = 0;
		
		for(int i = 0; i < height.length; i++) {
			sum += height[i];
		}
		
		System.out.printf("평균 : %.2f", sum / height.length);
		
		
		
		
		
		
		
	}
	
	public void ex4() {
		// 입력 받은 인원 수 만큼의 점수를 입력받아
//		배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		// ex)
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
		
		// 합계 : 290
		// 평균 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		double[] nums = new double[4];
		
		for(int i = 0; i < nums.length; i++) {
			
			System.out.printf("%d번 점수 입력 : ", i + 1);
			nums[i] = sc.nextDouble();
		}
		
		double result = 0;
		
		
		for(int i = 0; i < nums.length; i++) {
			
			result += nums[i];
			
		}
		
		double peng = 0;
		
		peng = (result / nums.length);
		
		double max = nums[0];
		double min = nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] > max) {
				max = nums[i];
			}
			
			
		}
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] < min) {
				min = nums[i];
			}
			
			
		}
		
		
		
		
		
		
		
		System.out.printf("합계 : %.0f\n", result);
		System.out.printf("평균 : %.0f\n", peng);
		System.out.printf("최고점 : %.0f\n", max);
		System.out.printf("최저점 : %.0f\n", min);
		
			
		//xxx	
	}	
		
	public void ex5() {
		// 배열 선언과 동시에 초기화
		
    char[] arr = new char[5];
    
    for(int i = 0; i < arr.length; i++) {
    	   arr[i] = (char)('A' + i);
    }
    

    

    		
    
    
    // ** Arrays 클래스
    // -> Java 에서 제공하는 배열과 관련된 기능을 모아둔 클래스
    
    // Arrays.toString(배열명) : 모든 요소 값을 출력
    
    System.out.println(Arrays.toString(arr)); // [A, B, C, D, E]
    
    int[] arr2 = new int[4]; 
    System.out.println(Arrays.toString(arr2));
    
    
    boolean[] arr3 = new boolean[2];
    
    String[] arr4 = new String[3];
    
    System.out.println(Arrays.toString(arr3));
    System.out.println(Arrays.toString(arr4));
    
    
		// 배열 선언과 동시에 초기화
    
    char[] arr5 = {'A', 'B', 'C', 'D', 'E'};
    // {} (중괄호) 는 배열의 리터럴 표기법

     System.out.println(Arrays.toString(arr5));
		
	}
	
	public void ex6() {
		
		// 점심 메뉴 뽑기 프로그램
		
		String[] arr = {"제육", "라면", "김밥", "쭈꾸미","돈까스"};
		
	 System.out.println("오늘 점심 메뉴 : " + arr[(int)Math.floor(Math.random() * 5)]);
		
		
	}
	
	public void ex7() {
		
		// 배열을 이용한 검색
		
		// 입력 받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
 		
		// ex)
		// 정수 입력 : 200
		// 1번째 인덱스에 존재
		
		// 정수 입력 : 5
		// 존재하지 않음
		
		Scanner sc = new Scanner(System.in);
		 int[] arr = {100, 200, 300, 400, 500, 600,700,800,900,1000};
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println(Arrays.toString(arr));
		
		
		// 신호를 나타내기 위한 변수
		// flag == false : 일치하는 값이 존재하지 않음
		// flag == true : 일치하는 값이 존재
		
		boolean flag = false;
		
		 
		 for(int i = 0; i < arr.length; i++) {
			 
			 
					  
					  if(  arr[i] == num) {
						  flag = true; 
						  System.out.printf("%d 번째 인덱스에 존재", i);
					  }
					  
					 
			   
					
		 }
		 
		        //flag 상태를 검사
		 
		 if(flag == false) {
			 System.out.println("값이 존재하지 않음");
		 }
		 
		
		
		
		
	}
	
	public void ex8() {
		
		//입력 받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		//없으면 "존재하지 않음" 출력
		
		boolean flag = false;
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론"};
		
		
		/*
		 * 과일 입력
		 * 5번 인덱스에 존재
		 * 
		 * 과일 입력 수박
		 * 존재하지 않음
		 * */
		
		Scanner sr = new Scanner(System.in);
		
		System.out.print("과일 입력 : ");
		String str = sr.nextLine();
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(str)) { // 문자열을 비교하려면 .equals를 해야된다
				System.out.printf("%d 번째 인덱스에 존재", i);
				flag = true;
				
			}
			
			
		}
		if(flag == false) {
			System.out.println("존재하지 않음");
		}
		
		
	}
	
	
	public void ex9() {
		//1.문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		//2.문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		//3.단, 일치하는 문자 없을경우 "존재하지 않습니다" 출력
		/*
		 * ex)
		 * 문자열 입력 :hello
		 * [h, e, l, l, o]
		 * 검색할 문자 입력 : l
		 * 2개 있음
		 * 
		 * 
		 * */
		
	
		Scanner sr = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sr.next();
		

		char[] arr = new char[str.length()];
		
		
		
		
		
//		String[] arr = new String[str.length()] << 이거를 안쓰는 이유는 새로운배열을 string 이라는 참조형으로 만들면 값이 예를들어 5개의 배열의 갯수를 만들엇다치면
//		// [null, null, ..] 이런식으로 나와서  for 문으로 넣어도 null값 뒤에 들어가게된다;
		// += 을 하면 그 값에 + 하는 격으로 되기 떄문에 안된다 null < 값 뒤로 + 되어 나타나게 된다 = 을해야 그 값이없어지고 바뀐다.
		
	
		
		
		for(int i = 0; i < str.length(); i++) {
			
			arr[i] += str.charAt(i);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.print("검색할 문자 입력 : ");
		char ua = sr.next().charAt(0);
		
		boolean flag = false;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == ua) {
				count++;
				flag = true;
			}
			
		}
		
		
		System.out.printf("%d 개 있음\n", count);
		
		if(flag == false) {
			System.out.println("일치하는게 없음");
		}
		
	}
	
	public void ex10() {
		
	
		
		
		
		
	}
	
//	xxxx
	}

		
		
		
		
		
			
			
			
		
		
		
		
		
		
		
	
	
