package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.vo.Person;

public class SetService {
      /* Set(집합, 주머니)
       *  - 기본적으로 순서를 유지하지 않음
       *  (index 없음 -> get() 메서드가 없음)
       *  
  */
	
	
	/**
	 * 
	 * HashSet 사용법 !
	 *  - 사용 조건 1 : 객체에 equals() << 이게 오버라이딩 되어있어야됨
	 *  - 사용 조건 2 : 객체에 hashCode() << 오버라이딩 되어있어야됨
	 *    
	 *   -> String, Integer 등 자바에서 제공하는 객체는
	 *   
	 *   모두 equals(), hashCode() 오버라이딩이 되어있는 상태
	 * 
	 */
	
	public void method1() {
		
		Set<String> set = new HashSet<String>();
//		Set<String> set = new LinkedHashSet<String>();
		
		// 1.add(E e) 반환형은 boolean
		
		set.add("강아지");
		set.add("고양이");
		set.add("사자");
		set.add("호랑이");
		set.add("말");
		set.add("닭");
		set.add("재규어");
		set.add("독수리");

		System.out.println(set);
		
		// -> HashSet 순서 유지 x 확인
		
		// 중복 저장 확인 -> 중복 저장 X 확인
		
		set.add("강아지");
		set.add("강아지");
		set.add("강아지");
		set.add("강아지");
		set.add("강아지");
		
		System.out.println(set);
		
		
		//null도 중복 x 확인
		//null : 참조하는 객체가 없음
		//null 도 하나의 객체로 판명함
		
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set); // null 1회 출력
		
		
		// 2. int size() : Set에 저장된 객체(참조변수)의 수 반환
		
		System.out.println("set.size() : "  + set.size());
		
		
		// 3.boolean remove(E e) : 반환형 boolean
		// 제거 성공 true, 없으면 false
		
		System.out.println(set.remove("강아지"));
		System.out.println(set.remove("똥강아지"));
		
		System.out.println(set);
		
		//4 . contains() = 반환형 boolean
		
		System.out.println(set.contains("닭"));
		System.out.println(set.contains("호랑이"));
		
		// 5.clear() : 반환형 void
		set.clear();
		
		//6. isEmpty() : 반환형 boolean
		
		System.out.println(set.isEmpty());
		
		
	}
	
	
	/**
	 * 
	 * Set에 저장된 요소(객체)를 꺼내는 방법
	 * 1. Iterator(반복자) 이용
	 * 2. List 변환 
	 * 3. 향상된 for문 이용
	 * 
	 */
	public void method2() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("육개장");
		set.add("진라면");
		set.add("신라면");
		set.add("안성탕면");
		set.add("참깨라면");
		
		// 1. Iterator(반복자)
		 // 컬렉션 객체에 저장된 요소를
		// 하나씩 순차 접근하는 객체
		
		// 반환형이 Iterator
		// - 현재 Set을 순차 접근할 수 있는 Iterator 객체 반환
		
		
		Iterator<String> it = set.iterator();
		
		//Iterator.hasNext() : 반환형 boolean :
		//다음 순차 접근할 요소가 있으면 true, 없으면 false
		System.out.println("Iterator");
		while(it.hasNext()) {
			// 다음 요소가 있으면 반복 , 없으면 멈춤
			
			// E Iterator.next() : 다음 요소를 꺼내와 반환
			
			String temp = it.next();
			System.out.println(temp);
		}
		
		System.out.println("==================================================");
		
		System.out.println("[List 로 변환]");
		
		//set에 저장된 객체를 이용해서 list를생성
		
		List<String> list = new ArrayList<String>(set); 
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		System.out.println("==================================================");
		
		System.out.println("[향상된 for문]");
		
		for(String snack : set) {
			System.out.println(snack);
		}
		
	}
	
	
	
	
	
	/**
	 * 
	 * 직접 만든 클래스(Person)을 이용해 만든 객체를
	 * Set에 저장(중복 제거 확인)
	 * 
	 */
	public void method3() {
		
		
//		Person p1 = new Person("홍길동", 25, '남');
//		Person p2 = new Person("홍길동", 25, '남');
//		Person p3 = new Person("홍길동", 30, '남');
//		Person p3 = new Person("김길순", 20, '여');
		
		
		
		 
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 25, '남'));
		set.add(new Person("홍길동", 25, '남'));
		set.add(new Person("홍길동", 30, '남'));
		set.add(new Person("김길순", 20, '여'));
		
		for(Person pe : set) {
			System.out.println(pe);
		}
		
		
		System.out.println("==================================");
		
		//hashCode() : 객체 식별 번호(정수)
		
		for(Person pe : set) {
			System.out.println(pe.hashCode());
		}
		
		// *******************************************
		
		// Hash 라는 단어가 포함된 컬렉션 이용 시
		// hashCode(),equals() 오버라이딩 필수적으로 진행해야된다
		
	}
	
	/**
	 * 
	 * TreseSet : 이진 트리 구조를 이용해 객체를 저장하는 Set
	 *  -> 기본 오름차순 정렬
	 *  전제조건 : 저장되는 객체는 Comparable 인터페이스 상속 필수!
	 *  
	 *  Integer 는 이미 Comparable 상속이 이미 되어있음
	 */
	public void method4() {
		
		//난수 생성
		
		int randomNum = (int)Math.floor(Math.random() * 45 + 1);
		
		Random random = new Random();
		
		Set<Integer> lotto = new TreeSet<Integer>();
		
		//lotto에 저장된 값이 6개 미만이면 반복 멈춤
		
		while(lotto.size() < 6) {
			
			lotto.add(random.nextInt(45) + 1);
			
		}
		
		System.out.println(lotto);
		
		//
	}
	
	/**
	 * 금액을 입력 받아 (천원 단위)
	 * 1000원당 1회씩 번호를 생성해서 List에 저장한 후
	 * 생성 종료 시 한 번에 출력
	 */
	public void lottoNumberGenerator() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("금액을 입력 하세요(천원단위) : ");
		int money = sc.nextInt();
		
		
		if(money % 1000 != 0) {
			
			System.out.println("1000원 단위로 입력하세요");
			
			return;
		}
		
		
		
		

		List<Set<Integer>> list = new ArrayList<Set<Integer>>(); // 리스트의 원소가 Set<Integer>인 리스트

		for(int i = 0; i < money / 1000; i++) { // money / 1000 횟수만큼 반복
		    Set<Integer> lotto = new TreeSet<>(); // 각 반복마다 새로운 TreeSet 생성

		    while(lotto.size() < 6) {
		        Random random = new Random();
		        lotto.add(random.nextInt(45) + 1);
		    }

		    list.add(lotto); // 생성된 TreeSet을 리스트에 추가
		}
		
		
		
		for(Set<Integer> st : list) {
			System.out.println(st);
		}
	
		
		
				
		
		
		
		
		
	}
	
	
}
