package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
	 Scanner sr = new Scanner(System.in);
	 
	 System.out.print("1이상의 숫자를 입력하세요 : ");
	 int num = sr.nextInt();
	 
	 if(num < 1) {
		 System.out.println("1이상의 숫자를 입력해주세요");
	 }
	 
	 
	 for(int i = 1; i <= num; i++) {
		 
		
		 
		 System.out.printf("%d ", i);
		
		 
	 }
	 
	 
		
	}
	public void practice2() {
		
		Scanner sr = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 ");
		int num = sr.nextInt();
		
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
		for(int i = num; i >= 1; i--) {
			System.out.printf("%d ", i);
		}
	}
	
	public void practice3() {
		
		Scanner sr = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sr.nextInt();;
		String result = "1";
		int shat = 1;
		
		for(int i = 2; i <= num; i++) {
			result += " + " + i;
			shat += i;
		}
		
		System.out.print(result + " = " + shat);
		
	}
	
	public void practice4() {
		Scanner sr = new Scanner(System.in);
		
		System.out.printf("첫 번째 숫자 : ");
		int num1 = sr.nextInt();
		
		System.out.printf("두 번째 숫자 : ");
		int num2 = sr.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			
			return;
		}
		
	int count = 0;
		
		if(num1 > num2) {
			
			for(int i = 0; i <= num1 - num2; i++) {
				
			
				System.out.printf("%d ", num2 + count);
				count++;
			}
			
		}
		
	if(num1 < num2) {
			
			for(int i = 0; i <= num2 - num1; i++) {
				
				System.out.printf("%d ", (num1 + count));
				count++;
			}
			
		}
		
		
	}

    public void practice5() {
    	
    	Scanner sr = new Scanner(System.in);
    	
    	System.out.print("단 을 입력 ");
    	int num = sr.nextInt();
    	
    	System.out.println("======" + num + "단" + "=======");
    	
    	for(int i = 1; i <= 9; i++) {
    		
    		System.out.printf("%d * %d = %d\n", num , i , num * i);
    		
    	}
    	
    }
	
	public void practice6() {
		Scanner sr = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sr.nextInt();
		String str = "";
		
		if(num >= 2 && num <= 9) {
			for(int i = num; i <= 9; i++) {
				System.out.println("===== " + i + " 단 " + "=====");
				
				for(int k = 1; k <= 9; k++) {
					System.out.printf("%d X %d = %d  ", i , k , num * i);
				}
				
				System.out.println();
			}
			
			
			
		}else {
			System.out.println("2~9 사이 숫자만 입력해주세요");
		}
		
		
		
		
	}
	
	
	public void practice7() {
		
	Scanner sr = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sr.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			for(int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	public void practice8() {
	Scanner sr = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sr.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			for(int k = num; k > i; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice9() {
		
Scanner sr = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sr.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			for(int j = num; j > i+1; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i + 1; k++) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
	}
	
	public void practice10() {
Scanner sr = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sr.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			for(int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < num -1; i++) {
			
			for(int k = num; k > i + 1; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public void practice11() {
		
Scanner sr = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sr.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			for(int k = num; k > i + 1; k--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < (2 * i) + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
	
	public void practice12() {
		Scanner sr = new Scanner(System.in);
		
		
		
		System.out.print("정수 입력 : ");
		int num = sr.nextInt();
		
		
		for(int i = 0; i < num; i++) {
			
			System.out.print("*");
			
		}
		
		System.out.println();
		
	for(int i = 0; i < num; i++) {
			
			if(i > 0 && i < 4) {
				continue;
			}
			
			
			
			System.out.print("*");
			for(int k = 0; k < 3; k++) {
				System.out.print(" ");
			}
		}
	
	System.out.println();
	
for(int i = 0; i < num; i++) {
		
		if(i > 0 && i < 4) {
			continue;
		}
		
		
		
		System.out.print("*");
		for(int k = 0; k < 3; k++) {
			System.out.print(" ");
		}
	}

System.out.println();

for(int i = 0; i < num; i++) {
	
	if(i > 0 && i < 4) {
		continue;
	}
	
	
	
	System.out.print("*");
	for(int k = 0; k < 3; k++) {
		System.out.print(" ");
	}
}
		
		System.out.println();
		

for(int i = 0; i < num; i++) {
	
	System.out.print("*");
	
}
	
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		String result = "";
		while(true) {
			++count;
			
			int second = 2 * count;
			int third = 3 * count;
			
			
			
			
			if(second > num|| third > num) {
				break;
			};
			
			if(second != third) {
				result += second + " " + third + " ";
			}else {
				result += second + " ";
				
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
		System.out.print(result);
		
	}
	
	
	
	
}
