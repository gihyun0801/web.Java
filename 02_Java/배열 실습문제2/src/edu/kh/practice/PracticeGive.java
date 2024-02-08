package edu.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeGive {

public void practice() {
	
Scanner sc = new Scanner(System.in);

System.out.print("배열의 크기를 입력하세요 : ");
int str = sc.nextInt();

String[] arr = new String[str];

int shot = 0 ;

for(int i = 0; i < str; i++) {
	shot++;
	System.out.printf("%d 번째 문자열 : \n", shot);
	String book = sc.next();
	arr[i] = book;

}


int count = 0;
while(true) {
	System.out.print("값을 더 입력하시겠습니까? : ");
	String yesNo = sc.next();
	
	
	if(yesNo.equals("y")) {
		
		
		System.out.print("입력하고 싶은 개수 : ");
		int more = sc.nextInt();
		
		System.out.printf("%d 번째 문자열 : ", shot);
		String good = sc.next();
		String[] arr2 = new String[more];
		for(int i = 0; i < more; i++) {
			shot++;
			arr2[count] = good;
					count++;
			
		}

			 
		
		
	}else {
		   break;
		   
		   
	}
	
}


String result[] = Arrays.copyOf(arr, arr.length);




}
	
}
