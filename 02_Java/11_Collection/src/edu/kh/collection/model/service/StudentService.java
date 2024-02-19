package edu.kh.collection.model.service;

import java.util.ArrayList; // List 를 상속받아 사용
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List; // Interface
import java.util.Scanner;
import edu.kh.collection.model.vo.Student;

public class StudentService {
      //필드
	
	private Scanner sc = new Scanner(System.in);
	
	// 학생 정보를 저장할 List 생성
	
	
	// java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
	// * 인터페이스는 객체 생성이 불가능 , 부모 참조변수로 역할은 가능
	
	
	// java.util.ArrayList : 배열 형태 List(가장 대표적인 List 자식 클래스)
	
	
	// ArrayList() 기본생성자 : 기본 크기 10짜리 리스트 생성
//					-> 하지만 리스트는 크기가 늘었다 줄었다 하기때문에 큰 의미가 없음
	
	//ArrayList(용량) : 용량만큼의 리스트 생성
    //					 -> 너무 큰값을 작성하면 메모리를 많이 소모함.	
	
	private List<Student> studentList =  new ArrayList<Student>();  //검색(조회)에 효율적
//	private List studentList =  new LinkedList(); // 추가, 수정, 삭제에 효율적
	
	            //컬렉션 명
	
	public StudentService() {
		studentList.add(new Student("홍길동", 65, "서울시 중구", 'm', 90));
		studentList.add(new Student("고영희", 45, "서울시 도봉", 'm', 10));
		studentList.add(new Student("짱구", 35, "서울시 마포", 'm', 50));
		studentList.add(new Student("배찌", 21, "서울시 잠실", 'm', 40));
		studentList.add(new Student("우니", 22, "서울시 광진구", 'm', 30));
	}
	
	public void ex1() {
		// List 테스트
		
		//List.add(Object e) : 리스트에 객체를 추가
		// * 매개변수 타입이 Object == 모든 객체를 매개변수로 전달할 수 있음
      
		studentList.add(new Student()); // 0번 인덱스 괄호안에 Object 가 빠졋다 그래서 값을 넣으면 업캐스팅이되서 NEW STUDENT 가 object의 부모가 된다
		studentList.add(sc); // 1번 인덱스 
		studentList.add("문자열"); // 2번 인덱스 스트링도 객체화 되서 들어감
		studentList.add(new Object()); // 3번 인덱스
		
		// 컬렉션 특징 : 여러 타입의 데이터를 저장할 수 있다
		// 만약에 int 배열을 만들면 int만들어가야되는데 얘는 타입이달라도 가능
		
		//List.get(index i); 이걸 실행했을때 반환형이 object 이다 리스트에서 i번째 인덱스에 있는
		//객체를 반환
		   
		
		   //Oject 객체 (최상위 객체)
		if(studentList.get(0) instanceof Student) {
			System.out.println(((Student)studentList.get(0)).getName()); //get을 못쓰는이유는 반환형이 object 라서 다운캐스팅을 해줘야한다 
		}
		
		
//		System.out.println(studentList.get(1));
//		System.out.println(studentList.get(2));
//		System.out.println(studentList.get(3));
		
		 //제네릭스 
		
		// -> 컬렉션에 저장되는 객체 타입을 한가지로 제한 : <E>
		
		
		
		
		
	}
	
	//메뉴 출력용 메서드
	/**
	 *  alt + shift + j
	 *  메서드 설명용 주석
	 *  @author gihyun0801@naver.com
	 */ 
	
	public void displayMenu() {
		
		
		int menuNum = 0; //메뉴 선택용 변수
		
		do {
			
			
			System.out.println("\n=============== 학생관리 프로그램 =================\n");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("0. 프로그램종료");
			
		
			
			System.out.print("메뉴 선택 : ");
			
			
			
			try {
				
				menuNum = sc.nextInt();
				System.out.println();
				
				switch(menuNum) {
				case 1 : System.out.println(addStudent()); break;
				case 2 : selectAll(); break;
				case 3 :System.out.println( updateStudent()); break;  
				case 4 : System.out.println( removeStudent()); break;
				case 5 : System.out.println(searchName1()); break; 
				case 6 : System.out.println(searchName2());; break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요");    break;
				}
				
				
			}catch(InputMismatchException e) {
				
				System.out.println("입력 형식이 유효하지않습니다");
				sc.nextLine(); // 입력버퍼에 남아있는거 제거
				menuNum = -1; //첫 반복시 잘못 입력하는 경우
				//menuNum 이 그대로 0을 가지고 있어 종료되는데
				//이를방지하기 위해 임의값 -1대입
			}
			
			

			
			
			
			
			
			
			
			
			
		}while(menuNum != 0);
		
		
	}
	
	
	
	/**
	 * 1. 학생 정보 추가 메서드
	 * - 추가 성공 시 "성공" 실패 시 "실패" 문자열 반환
	 * 
	 */
	public String addStudent() throws InputMismatchException{
		System.out.println("========학생 정보 추가==========");
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("지역 : ");
		String region = sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		;
		                 //업캐스팅 Student 
		//(반환형)   -> 제네릭 student 때문에 list에 추가할수 있는 객체 타입이
		 // Student로 제한됨
		
		
		          //add는 현재 boolean 들어가는걸 성공하면 true반환
		if(studentList.add(new Student(name, age, region, gender, score)) ) {
			
			
			return "성공";
		}else {
			
return "실패";
		}
	}
	
	
	
	
	/**
	 * 학생 전체 조회 메서드
	 * - List가 비어있는 경우 학생 정보가 없습니다 출력
	 * 있는 경우 전체 학생 출력
	 */
	public void selectAll() {
		
//		interface 인 컬렉션들 안에있는 객체의 갯수를 알아오는법
		
		//List에 저장된 데이터의 개수를 얻어오는 방법 : int List.size()
		// -> 배열명.length 대신 사용
		//이건 숫자가 반환값;
		
		// 아니면 isEmpty = 이건 boolean 값이 반환값
	
		
		System.out.println("=========학생 전체 조회 ========");
		
		if(studentList.isEmpty()) {
			System.out.println("학생 정보가 없습니다");
			return;
		}
		
		
//		for(int i = 0; i < studentList.size(); i++) {
//			studentList.get(i);
//		}
		
		//향상된 for문 ( for each문)
		//-컬렉션 , 배열의 모든 요소를 순차적으로 반복접근 할 수 있는 for문
		// 순차적 : 0 번 인덱스부터 마지막 요소까지 인덱스를 1씩 증가
		
		
		//작성법
		//for(컬렉션 또는 배열에서 꺼낸 한개의 요소를 저장할 변수 : 컬렉션명 또는 배열명){}
		int index = 0;
		for(Student std : studentList) {
//			 std 에는 for문 반복 시 마다 0,1,2 인덱스 요소들 한번씩 저장됨
			System.out.print((index++) + "번 : ");
			System.out.println(std);
		}
		
		
		
	}
	
	
	/**
	 * 학생 정보 수정 메서드
	 * 학생정보가 studentList에 있는지 검사, 없다면 "입력된 학생 정보가 없습니다" 문자열 반환
	 * 입력된 숫자가 0보다 작은지 검사 작다면 "음수는 입력할 수 없습니다 " 문자열 반환
	 * studentList 범위 내 인덱스번호인지 검사, 초과했다면 범위를 넘어선 값을 입력할 수 없습니다 문자열 반환
	 * 수정이 완료되었다면 , 000 정보가 변경되었습니다
	 */
	public String updateStudent() throws InputMismatchException{
		
		// List.set(int index, Student e) // Student 객체를 반환함 기존에있던 내용을 반환
		// -> List 에 index번째 요소를 e로 변경 
		// -> 반환값 Student === 변경 전 Student 객체가 담겨있음
       
		
		System.out.println("===학생 정보 수정===");
		
		System.out.print("인덱스 번호 입력 : ");
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다";
		}else if(index < 0) {
			return "음수는 입력할 수 없습니다";
		}else if(index >= studentList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다";
			
			// 4)만약 문자열을 입력한 경우 -> 예외처리
		}else {
			//수정 코드 작성
			
			
			System.out.println(index + "번째에 저장된 학생 정보");
			System.out.println(studentList.get(index));
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("지역 : ");
			String region = sc.nextLine();
			
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			
			//입력받은 index 번째에 새로운 학생 정보를 세팅 
			
			Student temp = studentList.set(index, new Student(name, age, region, gender, score));
			
			//index 에 있던 학생 정보가 반환되어 temp 에 들어간다;
			
			return temp.getName() + "의 정보가 변경되었습니다";
			
			
		}
		

		
		
		
		
	}
	
	
	
	/**학생 정보 제거 메서드
	 * @return String
	
	 */
	public String removeStudent() throws InputMismatchException{
		
		//List.remove(int index) = 반환형은 student 객체
		//이 때 , 제거된 요소가 반환된다.
		// List는 중간에 비어있는 인덱스가 없게 하기 위해서
		// remove() 동작 시 뒤쪽 요소를 한칸씩 당겨온다
		
		
		System.out.println("========= 학생 정보 제거 ==========");
		
		
		System.out.print("인덱스 번호 입력 : ");
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다";
		}else if(index < 0) {
			return "음수는 입력할 수 없습니다";
		}else if(index >= studentList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다";
			
			// 4)만약 문자열을 입력한 경우 -> 예외처리
		}else {
			
			
			
			
			// 학생 정보 제거
			
			System.out.printf("정말 삭제 하시겠습니까 ?  y / n : ");
			
			char ch = sc.next().toUpperCase().charAt(0);
			
			
			if(ch == 'Y') {
				
				Student temp = studentList.remove(index);
				
				
				return temp + "님의 정보가 제거되었습니다";
				
			} else {
				return "취소";
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}
	
	
	/**
	 * @return
	 *  * 이름이 일치하는 학생을 찾아서 조회하는 메서드(완전 일치)
	 * 검색할 이름 입력받기 studensList에서 꺼내온 student객체의 name 값이 같은지 
	 * 검색 결과가 없습니다 출력
	 */
	public String searchName1(){
		
		if(studentList.size() == 0) {
			return "학생이 아무도 없습니다";
		}else {
			
			System.out.println("===학생 찾기===");
			
			System.out.println();
			
			
			System.out.print("검색할 학생의 이름을 입력하세요 : ");
			
			String name = sc.next();
			
			for(Student std : studentList) {
				
				if(std.getName().equals(name)) {
					return "검색하신 학생이 존재합니다";
				}
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		return "검색 결과가 없습니다";
	}
	
	
	/**
	 * @return
	 * 이름이 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드
	 * 문자열 입력받아 studentList에서 꺼내온 Student 객체의 name값에 포함되는 문자열인지 검사
	 * 포함되는 경우 Student 객체 출력 
	 * 검색결과가 없습니다
	 * 
	 */
	public String searchName2(){ 
		
		//String.contains(문자열) == 반환형은 boolean : string에 문자열이 포함되어 있으면 true/ 없으면 false
        
		System.out.println("===이름으로 검색 (포함)===");
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		
		
		
		for(Student std : studentList) {
			
			if(std.getName().contains(name)) {
				return "찾으시려는 이름의 학생의 정보는 아마도  : " + std; 
			}
			
			
		}
		
		
		
		return "찾으시려는 정보가 없습니다";
	}
	
	
	
	
	
	
	
	
	
}
