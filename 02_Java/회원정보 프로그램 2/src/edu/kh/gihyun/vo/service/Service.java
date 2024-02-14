package edu.kh.gihyun.vo.service;

import java.util.Scanner;

import edu.kh.gihyun.vo.Member;

public class Service {
     
	private Scanner sc = new Scanner(System.in);
	
	private Member[] memberInfo = new Member[3];
	
    private Member loginMember = null;
    
    
public Service() {
    	
    	memberInfo[0] = new Member("user01", "pass01", "홍길동", 50, "제주도");
    	
    }
    
    
    public void practice() {
    	
    	
    	
    	
    	  int num = 0;
    	    
    	    do {
    	    	
    	    	System.out.println("\n===회원 정보 관리 프로그램===");
    	    	System.out.println("1. 회원가입");
    	    	System.out.println("2. 로그인");
    	    	System.out.println("3. 회원 정보 조회");
    	    	System.out.println("4. 회원 정보 수정");
    	    	System.out.println("5. 회원 검색 지역");
    	    	System.out.println("6. 로그아웃");
    	    	System.out.println("0. 프로그램 종료");
    	    	
    	    	System.out.print("메뉴를 선택하세요 : ");
    	    	
    	    	
    	    	num = sc.nextInt();
    	    	sc.nextLine();
    	    	
    	    	
    	    	switch(num) {
    	    	case 1: System.out.println(signUp()); break;
    	    	case 2: System.out.println(login()); break;
    	    	case 3: System.out.println(SearchMember()); break;
    	    	
    	    	
    	    	case 4: int result = reFrash();
    	    	
    	    	     if(result == -1) {
    	    	    	 System.out.println("로그인을 해주세요");
    	    	     }else if(result == 0) {
    	    	    	 System.out.println("비밀번호가 일치하지 않습니다");
    	    	     }else if(result == 1) {
    	    	    	 
    	    	    	 System.out.println("정보 변경 완료");
    	    	    	 
    	    	     }
    	    	     break;
    	    	
    	    	case 5: System.out.println(SearchRegion()); break;
    	    	case 6: System.out.println(logOut()); break;
    	    	
    	    	case 0: System.out.println("프로그램 종료"); break;
    	    	
    	    	}
    	    	
    	    	
    	 
    	    }while(num != 0);
    	    	
    	    	
    }

 
    
    
    public String signUp() {
    	
    	System.out.println("===회원가입===");
    	
    	System.out.print("아이디 : ");
    	String Id = sc.next();
    	
    	System.out.print("비밀번호 : ");
    	String Pw = sc.next();
    	
    	System.out.print("비밀번호 확인 : ");
    	String PwRe = sc.next();
    	
    	System.out.print("이름 : ");
    	String name = sc.next();
    	
    	System.out.print("나이 : ");
    	int age = sc.nextInt();
    	sc.nextLine();
    	
    	System.out.print("사는 곳 : ");
    	String region = sc.next();
    	
    	if(PwRe.equals(Pw)) {
    		for(int i = 0; i < memberInfo.length; i++) {
        		
        		if(memberInfo[i] == null) {
        			memberInfo[i] = new Member(Id, Pw, name, age, region);
        			return "회원가입이 완료되었습니다";
        			
        			
        		}
        		
        		
        			
        		
        		
        	}
    		return "자리가 없어서 가입불가";
    	}
    	
    	return "비밀번호가 일치하지 않습니다";
    
    	
    }
    
    
    
    public String login() {
    	
    	System.out.println("====로그인====");
    	
    	System.out.print("아이디 : ");
    	String Id = sc.next();
    	
    	System.out.print("비밀번호 : ");
    	String Pw = sc.next();
    	
    	for(int i = 0; i < memberInfo.length; i++) {
    		
    		if(memberInfo[i] != null) {
    			if(memberInfo[i].getMemberId().equals(Id) &&
        				memberInfo[i].getMemberPw().equals(Pw)	) {
        			
        			loginMember = memberInfo[i];
        			break;
        		}
    		}
    		
    		
    		
    	}
    	
    	if(loginMember == null) {
    		return "아이디 또는 비밀번호가 일치하지 않습니다";
    	}
    	
    	
    	return loginMember.getMemberName() + "님 로그인 성공 !";
    	
    	
    	
    	
    	
    	
    		
    	
    }
	
    
    
    public String SearchMember() {
    	
    	System.out.println("===회원정보 조회===");
    	
    	if(loginMember == null) {
    		return "로그인 후 이용 해주세요";
    	}
    	
    	return "이름 : " + loginMember.getMemberName() + "\n" +
    		   "아이디 : " + loginMember.getMemberId() + "\n" + 
    		   "나이 : " + loginMember.getMemberAge() + "\n";
    	
    }
    
    
    
    
    
    public String SearchRegion() {
    	
    	System.out.println("===회원 지역 검색===");
    	
    	System.out.print("검색 하고 싶은 회원의 이름 ? : ");
    	String name = sc.next();
    	
    	for(int i = 0; i < memberInfo.length; i++) {
    		
    		if(memberInfo[i] != null) {
        		if(memberInfo[i].getMemberName().equals(name)) {
        			
        			return "검색하신 " +  memberInfo[i].getMemberName() + " 님의 지역은 " + 
        			                     memberInfo[i].getMemberRegion() + " 입니다";
        			
        		}
    		}
    		

    		
    		
    	}
    	
    	return "검색한 회원이 존재하지않습니다";
    	
    }
    
    
    public int reFrash() {
    	
    	
    	if(loginMember == null) {
    		return -1;
    	}
    	
    	
    	System.out.print("수정할 이름 입력 : ");
    	String inputName = sc.next();
    	
    	System.out.print("수정할 나이 입력 : ");
    	int inputAge = sc.nextInt();
    	
    	System.out.print("수정할 아이디 입력 : ");
    	String inputId = sc.next();
    	
    	
    	System.out.print("비밀번호 입력 : ");
    	String inputPw = sc.next();
    	
    	if(!(loginMember.getMemberPw().equals(inputPw))) {
    		
    		
    		return 0;
    	}
    	
    	loginMember.setMemberName(inputName);
    	loginMember.setMemberAge(inputAge);
    	loginMember.setMemberId(inputId);
    	
    	return 1;
    	
    	
    	
    	
    	
    }
    
    
    public String logOut() {
    	
    	if(loginMember == null) {
    		return "로그인을 해주세요";
    	}
    	
    	
    	loginMember = null;
    	
    	return "로그아웃 성공 !";
    	
    }
    
    
    
    
    
    
}
