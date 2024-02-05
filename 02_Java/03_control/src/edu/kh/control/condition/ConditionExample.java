package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {//기능 제공용 클래스
	
Scanner sc = new Scanner(System.in);

public void ex1() {
	
// if문
// 조건식이 true 일때만 내부 코드 수행
	
/*
 * [작성법]
 * if(){
 *  조건식이 true 일 때 수행할 코드
 *  }
 * 
 * 
 * */	
	
	
	// 입력받은 정수가 양수인지 검사
	// 양수라면 "앙수입니다" 출력
	// 음수라면 "음수입니다" 출력
	
	int num1 = sc.nextInt();
	
	if(num1 > 0) {
		System.out.println("양수입니다");
	}else if(num1 < 0) {
		System.out.println("음수입니다");
	}else if(num1 == 0) {
		System.out.println("0입니다");
	}
	
};


public void ex2() {
	
	
	// if - else 문
	// 조건식 결과가 true면 if문,
	// false면 else 구문이 수행됨
	
	/*
	 * [작성법]
	 * 
	 * if(조건식){
	 *   조건식이 true일 때 수행할 코드
	 *   }else {
	 *    조건식이 false일 때 수행할 코드}
	 *   
	 * 
	 * 
	 * 
	 * */
	
	//홀짝 검수
	//입력받은 정수값이 홀수이면 "홀수입니다" 출력
	//0이면 "0입니다"
	//짝수이면 "짝수입니다"
	System.out.print("정수를 입력 : ");
	
	int num1 = sc.nextInt();
	
	if(num1 % 2 != 0) {
		System.out.println("홀수입니다");
	}else {
		if(num1 == 0) {
			System.out.println("0입니다");
		}else {
			System.out.println("짝수입니다");
		}
	}
		
		
	
	

	
};



public void ex3() {
	// 양수, 음수, 0, 판별
	// if(조건식) - else if(조건식) - else
	
	System.out.print("정수 입력 : ");
	int input = sc.nextInt();
	
	if(input > 0) {
		System.out.println("양수 입니다");
	}else if(input < 0) {//바로 위에있는 if문이 만족되지 않은 경우 수행
		System.out.println("음수 입니다");
	}else {
		System.out.println("0 입니다");
	}
};


public void ex4() {
	
	//달(month)을 입력받아 해당 달에 맞는 계절 출력
	//단, 겨울일때 온도가 -15도 이하 "한파 경보", -12이하 "한파주의보"
	//여름일때 온도가 35도 이상 "폭염 경보", 33도 이상 폭염 주의보
    // 1~12 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
	//1,2,12 겨울
	//3~5 봄
	//6~8 여름
	//9~11 가을
	
	System.out.print("정수를 입력하세요 : ");
	int num = sc.nextInt();
	
	
	
	
	if(num == 1 || num == 2 || num == 12 ) {
		
		System.out.print("온도를 입력하세요 : ");
		int winter = sc.nextInt();
		
		
		
		if(winter <= -15) {
			
			System.out.print("겨울입니다 ");
			System.out.println(" 한파 경보");
		}else if(winter <= -12) {
			
			System.out.print("겨울입니다 ");
			System.out.println(" 한파 주의보");
		}else {
			System.out.println("겨울입니다");
		}
		
		
	}
	
	 if(num >= 3 && num <= 5) {
		 System.out.println("봄 입니다");
	 };
	 
	 if(num >= 6 && num <= 8) {
		 System.out.print("온도를 입력하세요 : ");
		 int summer = sc.nextInt();
		 
		 if(summer >= 33) {
			 System.out.print("여름입니다 ");
			 System.out.println(" 폭염 주의보");
		 }else if(summer >= 35) {
			 System.out.print("여름입니다 ");
			 System.out.println(" 폭염 경보");
		 }else {
			 System.out.println("여름입니다");
		 }
		 
		 
	 };
	 
	 if(num >= 9 && num <= 11) {
		 System.out.println("가을 입니다");
	 };
	
	
	
};


public void ex5() {
	
	
	System.out.print("나이를 입력하세요 : ");
	int age = sc.nextInt();
	
	if(age <= 13) {
		System.out.println("어린이 입니다");
	}else if(age > 13 && 19 >= age) {
		System.out.println("청소년 입니다");
	}else if(age > 19) {
		System.out.println("성인 입니다");
	};
	
	
	
	
	
};

public void ex6() {
	
System.out.print("점수를 입력하세요 : ");

int num = sc.nextInt();

if(num >= 90 && num <= 100) {
	System.out.println("A");
}else if(num >= 80 && 90 > num) {
	System.out.println("B");
}else if(num >= 70 && 80 > num) {
	System.out.println("C");
}else if(num >= 60 && 70 > num) {
	System.out.println("D");
}else if(num < 60) {
	System.out.println("F");
}else {
	System.out.println("잘못 입력함");
}
	
	
	
}

public void ex7() {
	System.out.print("나이를 입력하세요 : ");
	int age = sc.nextInt();
	System.out.print("키를 입력하세요 : ");
	int tail = sc.nextInt();
	
	if(age >= 12 && tail >= 140) {
		System.out.println("탑승 가능");
		
	
	}else if( age < 0 || age > 100) {
		System.out.println("잘못 입력 했음");
	}else {
System.out.println("탑승 불가능");
		
		if(age < 12) {
			System.out.println("어려서 못탐");
		}
		
		if(tail < 140) {
			System.out.println("키가 작아서 못탐");
	}
}}


public void ex8() {
	
	System.out.print("나이를 입력하세요 : ");
	int age = sc.nextInt();
	System.out.print("키를 입력하세요 : ");
	int tail = sc.nextInt();
	
	if(age < 0 || age > 100) {
		System.out.println("나이를 잘못 입력");
		return;
	}
	
	if(tail < 0 || tail > 250.0) {
		System.out.println("키를 잘못 입력");
		return;
	}
	
	if(age >= 12 && tail < 140) {
		System.out.println("나이는 적절하나 , 키가 적절치 않음");
	}	else if(age <= 12 && tail > 140) {
		System.out.println("키는 적절하나 나이가 부적절");
	}else if(age <= 12 && tail < 140) {
		System.out.println("나이와 키 모두 적절치 않음");
	}else {
		System.out.println("탑승 가능");
	}
	

	
	
	
	
	
}

}







