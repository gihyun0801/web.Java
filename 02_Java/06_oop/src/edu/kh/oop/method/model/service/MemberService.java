package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {
       
	// 속성 (필드)
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null; // 자료형이 vo 에 있는 Member
	//가입한 회원의 정보를 저장할 변수 Member 클래스에 있는 값들만 들어올수 있음
	//memberInfo = 참조변수 // Stack 
	//Member = heap
	//자료형으로 member 라고 해놧음
	
	private Member loginMember = null;// 로그인한 회원의 정보를 저장할 변수
    //Member 에 자리에는 String , int 이런게 오지만 클래스 이름도 온다 이렇게
	
	
	
	// 기능 (생성자, 메서드)
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		// 무조건 한번은 반복
		do {
			
			System.out.println("====회원 정보 관리 프로그램====");
			System.out.println("1, 회원 가입");
			System.out.println("2 로그인");
			System.out.println("3 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : System.out.println(selectMember()); break;
			case 4 : 
				int result = updateMember();
				
				if(result == -1) {
					System.out.println("로그인후 이용해주세요");
				}else if(result == 0) {
					System.out.println("비밀번호가 일치하지 않습니다");
				}else if(result == 1) {
					System.out.println("회원정보가 수정되었습니다");
				}
				
				
				break;
			case 0 : System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못 입력 하셨습니다 메뉴에 있는 번호만 입력 해주세요");
			
			}
			
			
		}while(menuNum != 0); // menuNum 이 0이면 반복 종료
		
		
	}
	
	
	// 회원 가입 기능
	



	public String signUp() {
		//반환형
		//해당 메서드는 끝나고 호출한 곳으로 돌아갈때
		//String 자료형 값을 가지고 돌아간다.
		System.out.println();
		
		System.out.println("****** 회원 가입 *******");
		
		System.out.print("아이디 : ");
		String memberId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.nextLine();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.nextLine();
		
		System.out.print("이름 : ");
		String memberName = sc.nextLine();
		
		System.out.println("나이 : ");
		int memberAge = sc.nextInt();
		
		//비밀번호, 비밀번호 확인이 일치하면 회원가입
		//일치하지 않으면 회원가입 실패
		
		if(memberPw.equals(memberPw2)) { // 일치하는 경우
			
			//입력받은 정보를 이용해서 Member 객체 생성한 후
			// 생성된 객체의 주소를 필드에 있는 memberInfo 에 대입
			
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			
			return "회원가입 성공";
		}else {
			return "회원가입 실패 (비밀번호 불일치)";
		}
		
		
		
	}
	
	//로그인
	
	public String login() {
		
		System.out.println("\n******로그인*******");
		
		//회원가입을 했는지부터 확인
		// == memberInfo가 객체를 참조하고 있는지 확인 (null 인지 아닌지 확인)
		
		if(memberInfo == null) {//회원가입을 먼저 안한 경우
			// null : 아무것도 참조하고 있지 않음
			return "회원가입부터 진행해주세요!";
		}
		
		
		//회원가입 했다면, 로그인 기능 수행
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.nextLine();
		
		//회원 가입 정보 (memberInfo가 참조하는 member 객체)
		//저장된 아이디, 비밀번호가
		//입력받은 아이디, 비밀번호와 같으면 "로그인 성공"
		//같지않으면 "아이디 또는 비밀번호가 일치하지 않습니다" 리턴
		
		if(memberInfo.getMemberId().equals(memberId) &&
				memberInfo.getMemberPw().equals(memberPw)	) {
			
			//loginMember 에 Member 객체 주소 대입
             
			//얕은 복사 주소만 참조하고 있음.
			loginMember = memberInfo;
			// 회원가입정보를 loginMember에 대입하여
			// 어떤 회원이 로그인했는지를 구분할 수 있게 함.
			
			return loginMember.getMemberName() + "님 로그인 성공";
		}else {
			return "아이디와 비밀번호가 일치하지 않습니다";
		}

			
			
		
		
	}
	
	
	// 회원정보조회
	
	public String selectMember() {
		
		// 1) 로그인 했는지 확인
		 // 로그인 안했을땐 "로그인 후 이용해주세요 " 리턴
		
		// 2) 로그인이 되어있는경우 
		// 회원정보를 출력할 문자열을 만들어서 반환 (return)
		// 단, 비밀번호는 제외
		
		
		if(loginMember == null) {
			return "로그인 후 이용해주세요";
		}
		
		
		return "이름 : " + memberInfo.getMemberName() + "\n" +
			   "아이디 : " + memberInfo.getMemberId() + "\n" +
		        "나이 : " + memberInfo.getMemberAge() + "세";
		
		
		
	}
    
	
	// 회원 정보 수정 기능
	
	public int updateMember() {
		
		System.out.println("\n*******회원 정보 수정********");
		
		//1) 로그인 여부 판별
		// 로그인이 되어있지 않으면 -1을 반환
		
		if(loginMember == null) {
			return -1;
		}
		
		//2) 로그인이 되어있을 때
		// 2-1) 수정할 회원 정보 입력 받기(이름, 나이)
		// 2-2) 비밀번호를 입력받아서 로그인한 회원의 비밀번호와 일치하는지 확인
		// -> 비밀번호가 같을 경우, 로그인한 회원의 이름, 나이 정보를 입력받은 값으로 변경 후 1 반환
		System.out.println("수정할 이름 입력 : ");
		String inputName = sc.nextLine();
		
		
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String Pw = sc.nextLine();
		
		System.out.println();
		
		
		if(loginMember.getMemberPw().equals(Pw)) {
			
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			
			return 1;
		}else {
			return 0;
		}
			
			
		
		
		
		
		
		
		
	}
	
	
}
