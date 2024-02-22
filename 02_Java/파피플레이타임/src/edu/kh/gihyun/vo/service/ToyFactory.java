package edu.kh.gihyun.vo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
		Toy add2 = new Toy("키시미시", 5, 36000, "분홍색", 
				19950805, "면직물, 고무");
		Toy add3 = new Toy("허기워기", 5, 36000, "분홍색", 
				19950805, "면직물, 고무");
		Toy add4 = new Toy("캣냅", 8, 36000, "분홍색", 
				19950805, "면직물, 고무");
		Toy add5 = new Toy("파피", 12, 36000, "분홍색", 
				19950805, "면직물, 고무");
		
		toysName.add(add1);
		toysName.add(add2);
		toysName.add(add3);
		toysName.add(add4);
		toysName.add(add5);
		
		
		
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
			case 6 : chuGa(); break;
			case 7 : delete(); break;
				
			
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
		    sc.nextLine(); // 입력 스트림 버퍼 비우기
		    
		    System.out.print("가격 : ");
		    int price = sc.nextInt();
		    sc.nextLine(); // 입력 스트림 버퍼 비우기
		    
		    System.out.print("색상 : ");
		    String color = sc.nextLine();
		    
		    System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		    int jejo = sc.nextInt();
		    sc.nextLine(); // 입력 스트림 버퍼 비우기
		    
		    String input = "";
		    String jaeRyo = "";
		    do {
		        System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요) : ");
		        input = sc.nextLine();
		        
		        if(!(input.equals("q"))) {
		            jaeRyo += input + ", ";
		        }
		        if(input.equals("q")) {
		            jaeRyo = jaeRyo.substring(0, jaeRyo.length() - 2);
		        }
		    } while(!input.equals("q"));

	    // 나머지 코드는 동일합니다...
		    
		    
		    if(jaeRyo.length() == 0) {
		    	System.out.println("재료는 한가지 이상 추가해야됩니다");
		    	return;
		    }
		    
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
		
        List<Toy> array = new ArrayList<Toy>();
		
		array = toysName;
		
		Comparator<Toy> toys = Comparator.comparing(Toy::getJeJo);
		
		
		Collections.sort(array, toys);
		
		
		
		
	
		
		
	}
	
	public void ageList() {
		
		
		List<Toy> toys = new ArrayList<Toy>();
		
		toys = toysName;
		
		Comparator<Toy> ya = Comparator.comparing(Toy::getAgeException);
		
		
		
		Collections.sort(toys,ya );
		
		int current = -1;
		
		for(Toy babo : toys) {
			
			if(current != babo.getAgeException()) {
				current = babo.getAgeException();
				System.out.println("[연령:" + current + "세]");
				System.out.println(babo);
			}else {
				System.out.println(babo);
			}
			
			
			
		}
		
		
	
		
		
		
		
	}
	
	public void chuGa() {
		
		
		
		System.out.println("<재료 추가>");
		System.out.println("--현재 등록된 재료--");
		
		Set<Entry<Integer, String>> set = ryo.entrySet();
		
		for(Entry<Integer, String> babo : set) {
			System.out.println(babo.getKey() + " : " + babo.getValue());
		}
		
		System.out.println("--------------------");
		
		System.out.print("\n재료 고유번호(Key) 입력 : ");
		int menu = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("\n재료 입력명 : ");
		String name = sc.next();
		
		for(Entry<Integer, String> ya : set) {
			if(ya.getKey() == menu) {
				System.out.println("\n이미 해당키에 재료가 등록되어있습니다.");
				System.out.print("\n덮어쓰시겠습니까 ? (Y/N) : ");
				char ch = sc.next().charAt(0);
				
				if(Character.toUpperCase(ch) == 'y') {
					ryo.put(menu, name);
					System.out.println("\n재료가 성공적으로 덮어씌기 되었습니다");
					return;
				}
			}
		}
		
		ryo.put(menu, name);
		System.out.println("\n새로운 재료가 등록되었습니다");
		
		
	}
	
	public void delete(){
		
		System.out.println("<재료 삭제>");
		System.out.println("현재 등록된 재료");
		
		    Set<Entry<Integer,String>> set   = ryo.entrySet();
		    
		    for(Entry<Integer, String> td : set) {
		    	System.out.println(td.getKey() + " : " + td.getValue());
		    }
		    
		    System.out.println("-------------------");
		    System.out.print("\n삭제할 재료명 입력 : ");
		    String name = sc.next();
		    
		    boolean flag = true;
		    
		    for(Entry<Integer,String> rr : set) {
		    	if(rr.getValue().equals(name)) {
		   		 ryo.remove(rr.getKey());
	    		  System.out.println("\n재료 : " + name + "가 성공적으로 제거되었습니다. ");
	    		  flag = false;
	    		  break;
		    		
		    	}
		    }
		    
		  
		    if(flag) {
		    	System.out.println("\n일치하는 재료가 없습니다");
		    }
		    
		    
		    
		  
		
	}
	
	
	
	
	
	
	
	
}
