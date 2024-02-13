package edu.kh.oop.method.model.vo;

public class Member {
	// 필드
	private String memberId; //아이디
	private String memberPw; //비번
	private String memberName; //이름
	private int memberAge; //나이
	
	
	
	
	
	// 생성자
	
	public Member() {
		
	};
	
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		//오버로딩 적용 : 오버로딩이란 class 내에 생성자를 여러개를 만드는것
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		
		
	}

	

   // 매개변수 생성자 자동완성 - > source 들어가서 Generate Constructor and using Field... 를 클릭하면 자동으로 생긴다
	
	
	
	// 메서드
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}  
	
	
	
	
	
}
