package edu.kh.oarr.model.vo.Member;

public class Member {
    
	
	//속성(필드 = 맴버변수)
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private int age;
	private String region;
	
	
	
	
	
	
	//반환형이 void 면 return 을 자동적으로 컴파일러가 생성해준다.
	
	
	//기능(생성자 + 메서드)
	
	public Member() {
		
	};
	
	public Member(String memberId, String memberPw, String memberName, int age, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName= memberName;
		this.age = age;
		this.region = region;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	

		 
		
	
	
	
}
