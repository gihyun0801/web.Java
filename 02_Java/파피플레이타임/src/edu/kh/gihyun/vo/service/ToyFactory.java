package edu.kh.gihyun.vo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.gihyun.vo.toy.Toy;

public class ToyFactory {
   
	Toy toy = new Toy();
	
	private Scanner sc = new Scanner(System.in);
	
	List<Toy> toysName = new ArrayList<Toy>();
	
	Map<Integer, String> ryo = new HashMap<Integer, String>();
	
	
	public ToyFactory() {
		
		ryo.put(1, "면직물");
		ryo.put(2, "플라스틱");
		ryo.put(3, "유리");
		ryo.put(4, "고무");
		
		
		
		
		Toy add1 = new Toy("마미롱레그", 8, 36000, "분홍색", 
				19950805, "면직물, 고무");
		
		toysName.add(add1);
		
		
		
	}
	
	
	
	
	public void displayMenu() {
		
		
		int menu = 0;
		
		
		do {
			
			System.out.println("\n<<플레이타임 공장>>\n");
			
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			
			System.out.print("\n선택 : ");
			menu = sc.nextInt();
			
			sc.nextLine();
			
			switch (menu) {
			case 1: showToy(); break;
			case 2: addToy(); break;
			case 3 : deleteToy(); break;
			case 4 : upSort(); break;
			case 5 : ageList(); break;
				
			
			default:  
				System.out.println("잘못된 숫자를 입력함");
				break;
				
			}
			
			
			
			
			
			
			
			
			
			
		}while(menu !=  0);
		
	}
	
	public void addToy() {
		System.out.println("\n<새로운 장난감 추가>\n");
		System.out.print("장난감 이름 : ");
		String toyName = sc.next();
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String color = sc.nextLine();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		int jejo = sc.nextInt();
		sc.nextLine();
		
		String input = "";
		String jaeRyo = "";
		do{
			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요) : ");
			
			input = sc.nextLine();
			
			if(!(input.equals("q"))) {
				jaeRyo += input;
				if(!sc.hasNext("q")) {
					jaeRyo += ", ";
				}
			}
			
			
			
		}while(!input.equals("q"));
		
		
		
		
	 for(Toy toys : toysName) {
		 if(toys.getToyName().equals(toyName) || toys.getItems().equals(jaeRyo)) {
			 System.out.println("\n똑같은 재료 또는 똑같은 장난감을 중복할순 없습니다\n");
			 return;
		 }
	 }
		
	 toysName.add(new Toy(toyName, age, price, color, jejo, jaeRyo));
	 
		System.out.println("추가 완료");
		
	}
	
	
	public void showToy() {
		for(Toy toy : toysName) {
			System.out.println();
			System.out.println(toy);
		}
	}
	
	public void deleteToy() {
		System.out.print("\n 삭제할 장난감의 이름 입력 : ");
		String name= sc.next();
		
		for(Toy toy : toysName) {
			if(toy.getToyName().equals(name)) {
				toysName.remove(toy);
				System.out.println("삭제완료");
				return;
			}
		}
		System.out.println("이름이 일치하지않음");
	}
	
	public void upSort() {
		
		
		Comparator<Toy> toys = Comparator.comparing(Toy::getJeJo);
		
		
		Collections.sort(toysName, toys);
		
		
		
		showToy();
		
		
	}
	
	public void ageList() {
		
//		Comparator<Toy> ya = Comparator.comparing(Toy::getAgeException);
//		
//		
//		
//		Collections.sort(toysName,ya );
		
		
		Set<Integer> age = new HashSet<Integer>();
		
		for(Toy toys : toysName) {
			
			age.add(toys.getAgeException());
			
			
		}
		
		for(Integer in : age) {
			
			for()
			
			
		}
		
		
	}
	
}
