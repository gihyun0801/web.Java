package com.hw1.run.Run;

import com.hw1.model.vo.Employee.Employee;

public class Run {
   public static void main(String[] args) {
	   
	   Employee[] emp = new Employee[3];
	   
	   Employee sr = new Employee();
	   
	   
	   System.out.println("emp[0] : " + sr.information());
	   
	   sr.setEmpNo(1);
	   sr.setEmpName("홍길동");
	   sr.setAge(19);
	   sr.setGender('M');
	   sr.setPhone("01022223333");
	   sr.setAddress("서울 잠실");
	   
	   System.out.println("emp[1] : " + sr.information());
	   
	   sr.setEmpNo(2);
	   sr.setEmpName("강말순");
	   sr.setDept("교육부");
	   sr.setJob("강사");
	   sr.setAge(20);
	   sr.setGender('F');
	   sr.setSalary(1000000);
	   sr.setBonusPoint(0.01);
	   sr.setPhone("01011112222");
	   sr.setAddress("서울 마곡");
	   
	   System.out.println("emp[2] : " + sr.information());
	   
	   System.out.println("======================================================");
	   
	   emp[0] = new Employee("김말똥", "영업부", "팀장", 30, 'M'
			   , "3000000", 0.2, "01055559999", "전라도광주");
	   
	   
	   
	   
	   
	   

	   
	   
	   
   }
}
