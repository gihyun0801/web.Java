package edu.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeGive {

public void practice() {
	
Scanner sc = new Scanner(System.in);

System.out.print("배열의 크기를 입력하세요 : ");
int num = sc.nextInt();

sc.nextLine();

String[] arr = new String[num];

int count = 1;

for(int i = 0; i < arr.length; i++) {
	System.out.printf("%d 번째 문자열 : ", i + 1);
	String str = sc.nextLine();
	count++;
	
}

while(true) {
	
	System.out.print("더 값을 입력하시겠습니까 ? : ");
	char ch = sc.next().charAt(0);
	
	if(ch == 'y' || ch == 'Y') {
		
		System.out.print("더 입력하고 싶은 개수 : ");
		int add = sc.nextInt();
		sc.nextLine();
		
		String [] result = new String[arr.length + add];
		
		for(int i = 0; i < result.length; i++) {
			
			if(i < arr.length) {
				result[i] = arr[i];
			}else {
				System.out.printf("%d번째 문자열 : ", count++);
				String ya = sc.nextLine();
				
				result[i] = ya;
			}
			
		}
		
		arr = result;
		
	}else {
		break;
	}
	
}
System.out.println(arr);






	

	
}



	











//xxx
}
