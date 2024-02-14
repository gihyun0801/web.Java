package edu.kh.oarr.model.vo.MemberService;

import edu.kh.oarr.model.vo.Member.Member;

import java.util.Scanner;

public class Service {
      

	
	private Scanner sc = new Scanner(System.in);
	
	// Member 5칸짜리 객체배열 선언 및 할당
	
	private Member[] memberArr = new Member[5];
	
	//현재 로그인한 회원의 정보를 저장할 변수 선언
	
	private Member loginInfo = null;
	
	public Service() {
		
		//memberArr 배열 0,1,2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "게보린", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 45, "강원");
		
	};
	
	public void displayMenu() {
		
		int menuNum = 0;
		

		
		do {
			
			System.out.println("===회원정보 관리 프로그램===");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			
			
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : System.out.println(searchMember()); break;
			case 4 : int result = updateMember();
			          
			          if(result == -1) {
			        	  System.out.println("로그인을 해주세요");
			          }else if(result == 0) {
			        	  System.out.println("비밀번호가 일치하지 않습니다");
			          }else {
			        	  System.out.println("회원 정보가 수정됐습니다");
			          }
			          
			          break;
			          
			 
			case 5 : searchRegion(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default: System.out.println("숫자만 입력해주세요");
			
			}
			
			
			
		}while(menuNum != 0); //num 이 0이면 프로그램 종료
		
		
	}
	
	//memberArr의 비어있는 인덱스 번호를 반환하는 메서드
	//단, 비어잇는 인덱스가 없다면 = 회원가입 을 다했으면 -1반환
	public int emptyIndex() {
		
		//memberArr 배열을 0 인덱스부터 끝까지 접근해서
		//참조하는 값이 null 인 경우의 인덱스를 반환
		
		for(int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	//회원가입 메서드
	public String signUp() {
		
		System.out.println("====회원 가입====");
		
		
		// 객체배열 memberArr에 가입한 회원 정보를 저장할 예정
		// -> 새로운 회원정보를 저장할 공간이 있는지 확인하고
		// 빈 공간의 인덱스 번호를 얻어오기
		
		int index = emptyIndex(); //memberArr 배열에서 비어잇는 인덱스 반환받음
//		(없다면 -1반환)
		
		if(index == -1) {
			return "회원가입 자리가 꽉차서 할수가 없습니다";
		};
		
		
		
		System.out.print("아이디 : ");
		String Id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String Pw = sc.nextLine();
		
		System.out.print("비밀번호 확인 : ");
		String PwRe = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("지역 : ");
		String region = sc.nextLine();
		
		if(!(Pw.equals(PwRe))) {
			return "비밀번호 확인이랑 입력한 비밀번호가 동일하지 않습니다";
		}else {
			// Member 객체 생성해서 할당된 주소를 memberArr의 비어있는 인덱스에 대입
			
			memberArr[index] = new Member(Id, Pw, name, age, region);
			return "회원가입이 완료 되었습니다.";
		}
		
		
		
		
		
	}
	
	public String login() {
		System.out.println("\n=====로그인========");
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		
		//1 ) memberArr 배열 내 요소를 순서대로 접근하여 null이 아닌지 확인
		
	    for(int i = 0; i < memberArr.length; i++) {
	    	
	    	if(memberArr[i] != null) {
	    		
	    		 // 2) 회원정보 (memberArr[i]) 의 아이디 , 비밀번호와 
	    		// 입력받은 아이디(memberId) 비밀번호(memberPw)가 같은지 확인
                       
	    		   if(memberArr[i].getMemberId().equals(memberId) && 
	    		      memberArr[i].getMemberId().equals(memberPw)) {
	    			   
	    			   // 3) 로그인 회원 정보 객체를 참조하는 변수 loginMember에
	    			   // 현재 접근중인 meberArr[i] 요소에 저장된 주소를 얕은 복사
	    			   loginInfo = memberArr[i];
	    			   break;
	    			   //맞는 얘를 찾으면 break 를 사용해 for문 종료
	    			   
	    			    
	    		   }
	    		
	    	   	}
	    	
	    }
		
	    
	    //4 로그인 성공/ 실패 여부에 따라 결과 값 반환
	    
	    if(loginInfo == null) {
	    	return "아이디 또는 비밀번호가 일치하지 않습니다";
	    }else {
	    	return loginInfo.getMemberName() + "님 로그인성공";
	    }
		
	}
	
	//회원 검색(지역)메서드
	
	public void searchRegion() {
		
		System.out.println("\n======회원 검색(지역)========");
		
		System.out.print("검색할 지역을 입력하세요 " );
		
		String region = sc.next();
		
		// 검색 결과 신호용 변수
        
		boolean flag = true;
		
		// 1) memberArr 배열의 모든 요소 순차 접근
		
		for(int i = 0; i < memberArr.length; i++) {
			
			// 2) memberArr[i] 요소가 null 인 경우 반복 종료
			
			if(memberArr[i] == null) {
				
				break;
				
			}
			
			// 3)memberArr[i] 요소에 저장된 지역이
			//입력받은 지역과 일치하는 경우 회원의 아이디 이름을 충력
			
			
			if(memberArr[i].getRegion().equals(region)) {
				
			   System.out.printf("아이디 : %s , 이름 : %s\n", memberArr[i].getMemberId(), memberArr[i].getMemberName());
				
			   flag = false;
			}
			
		}
		
		
		if(flag) {
			System.out.println("일치하는 검색결과가 없습니다");
		}
		
	}
	  
	
	//회원 정보 조회
	
	public String searchMember() {
		
		// 1. 회원이 있는지 없는지 확인
		
		System.out.println("\n=====회원 정보 조회=========");
		
		if(loginInfo == null) {
			
			return "로그인 후 이용바람";
			
		}
			
		// 2) 로그인이 되어있는 경우
		// 회원 정보를 출력할 문자열을 만들어서 반환
		// 단, 비밀번호는 제외
		
		String str = "이름 : " + loginInfo.getMemberName();
		
		str += "\n 아이디 : " + loginInfo.getMemberId();
		
		str += "\n나이 : " + loginInfo.getRegion();
		
		return str;
		
		
	}
	
	
	public int updateMember() {
		System.out.println("\n====회원 정보 수정=====");
		
		// 1) 로그인 여부 판별
		// 로그인이 되어있지 않으면 -1 반환
		
		if(loginInfo == null) {
			return -1;
		}
		
		// 2) 수정할 회원 정보 입력 받기(이름, 나이 , 지역)
		
		System.out.print("수정할 입력 : ");
		String inputName = sc.next();
		
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("수정할 지역 입력 : ");
		String inputResion = sc.next();
		
		// 3) 비밀번호를 입력 받아서
		// 로그인한 회원의 비밀번호와 일치하는지 확인
		
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		if(loginInfo.getMemberPw().equals(inputPw)) {
			
			//4) 비밀번호가 같을 경우
			// 로그인한 회원의 이름, 나이, 지역 정보를 입력 받은 값으로 변경
			// 변경 후 1 반환
			
			loginInfo.setMemberName(inputName);
			loginInfo.setAge(inputAge);
			loginInfo.setRegion(inputResion);
			
			return 1;
			
		}else {
			
			//5) 비밀번호가 다른 경우 0반환
			
			return 0;
		}
		
	}
	
	
}
