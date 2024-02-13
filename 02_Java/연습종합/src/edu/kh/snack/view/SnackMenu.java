package edu.kh.snack.view;

import java.util.Scanner;

import edu.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	
public void menu() {
	SnackController scr = new SnackController();
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("스낵류를 입력하세요.");
	
	System.out.print("종류 : ");
	String kind = sc.nextLine();
	
	System.out.print("이름 : ");
	String name = sc.nextLine();
	
	System.out.print("맛: ");
	String flavor = sc.nextLine();
	
	System.out.print("개수: ");
	int numOf = sc.nextInt();
	
	System.out.print("가격: ");
	int price = sc.nextInt();
	
	scr.saveDate(kind, name, flavor, numOf, price);
	
	
	
	
	
	
	System.out.println("저장 완료되었습니다.");
	
	
	System.out.printf("저장된 정보를 확인하시겠습니까? (y/n) : ");
	
	char ch = sc.next().charAt(0);
	
	if(ch == 'y' || ch == 'Y') {
		System.out.println(scr.confirmDate());
	}
	
	
	
	
}
	
	
	
	
}
