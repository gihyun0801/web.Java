package edu.kh.gihyun.vo;

public class Member {
  
  //속성 == 필드
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String memberRegion;
	
	
	//기능(생성자 + 메서드)
	
	public Member() {
		
	}
	
	public Member(String memberId, String memberPw, String memberName, 
			      int memberAge, String memberRegion) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberRegion = memberRegion;
		
	}

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

	public String getMemberRegion() {
		return memberRegion;
	}

	public void setMemberRegion(String memberRegion) {
		this.memberRegion = memberRegion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
