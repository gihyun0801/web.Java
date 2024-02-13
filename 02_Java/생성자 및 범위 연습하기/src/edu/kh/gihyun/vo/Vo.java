package edu.kh.gihyun.vo;

public class Vo {

private String name;
private String PNo;
private String address;


	
	
public Vo() {
	
	
	
};


public Vo(String name, String PNo) {
	
	
	
	
	System.out.println(this.name = name);
	System.out.println(this.PNo = PNo);
	
};
public Vo(String name, String PNo, String address) {
	
	
	
	
	this(name, PNo);
    System.out.println(this.address = address);
	
};




public Vo(String name) {
	
	
	
	
	System.out.println(this.name = name);
	
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getPNo() {
	return PNo;
}


public void setPNo(String pNo) {
	PNo = pNo;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
};






	
}
