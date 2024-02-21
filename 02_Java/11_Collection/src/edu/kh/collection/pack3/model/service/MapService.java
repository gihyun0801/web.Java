package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import edu.kh.collection.pack2.model.vo.Person;

import java.util.Set;

public class MapService {
  
	/*
	 * 
	 * 
	 * */
	
	
	

	public void method1() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 1. put() : Map 에 추가
		// k , v 전달   
		// 중복되는 key가 없으면 null
		// 중복되는 key가 있으면 이전 value 반환
		
		System.out.println(map.put(1, "에그마요"));
		System.out.println(map.put(2, "로티세리바베큐"));
		System.out.println(map.put(3, "스테이크앤치즈"));
		System.out.println(map.put(3, "스파이시쉬림프")); //3 중복
		
		System.out.println(map);
		
		System.out.println("===================================================");
		
		//2, V get(K K) ; key에 해당하는 value를 반환
		
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		
		String temp = map.get(1);
		
		System.out.println(temp);
		
		// 3 . size() : Map 에 저장된 Entry(k:v) 개수
		
		System.out.println(map.size());
		
		// 4. remove(key)
		
		System.out.println("remove(2) : " + map.remove(2));
		
		System.out.println(map);
		
		
		// 5. clear() : 모든 Entry 삭제
		// 6. boolean isEmpty() : 비어있는지 확인
		
		System.out.println(map.isEmpty());
		
		map.clear();
		
		System.out.println(map.isEmpty());
		
	}
	
	
	
	/**
	 * Map 요소(Entry) 순차 접근 하기 1
	 * - Map.keySet() 이용하기
	 */
	public void method2() {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원", "서울시 중구");
		map.put("집", "서울시 도봉구");
		map.put("롯데타워", "서울시 송파구");
		map.put("63빌딩", "서울시 영등포구");
		
		// Set<K> Map.keySet() :
		// - Map에 있는 Key 만 뽑아내서 Set 형태로 만들어 반환
		
		 Set<String> set = map.keySet();
		 
		 
		 System.out.println("keySet : " + set);
		 
	     for(String str : set) {
	    	 System.out.println(str + " : " + map.get(str));
	     }
		
	}
	
	
	public void method3() {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원", "서울시 중구");
		map.put("집", "서울시 도봉구");
		map.put("롯데타워", "서울시 송파구");
		map.put("63빌딩", "서울시 영등포구");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		//Entry.getKey()   :key만얻어오기
		//Entry.getValue() : Value만얻어오기
		
		for(Entry<String, String> entry : entrySet) {
			System.out.printf("key : %s , value : %s \n",
				entry.getKey(), entry.getValue()	);
		}
		
	}
	
	
	/**
	 * Map 활용 하기 - DTO 활용하기
	 * - 서로 다른 데이터를 한 번에 묶어서 관리해야 하는 경우
	 *  
	 */
	public void method4() {
		//DTO/VO 이용 방법
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setGender('남');
		
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %c \n", p1.getName(), p1.getAge(), p1.getGender());
		
		System.out.println("====================================================");
		
		// 객체를 한번만 사용할거같다 >> DTO 대신 Map 컬렉션 활용하기
		// - key는 무조건 String 활용하는게 best
		// -value의 타입은 모두 다름
		// -object를 부모 타입 참조 변수로 활용
		
		
		Map<String, Object> p2 = new HashMap<String, Object>();
		
		//데이터 추가
		
		p2.put("name", "김길순");
		p2.put("age", 45);  /*int - > Interger 변환*/ 
		p2.put("gender", '여'); /*char -> character 로 변환*/
		
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %c", p2.get("name"), p2.get("age"), p2.get("gender"));
	}
}
