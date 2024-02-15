package com.hw1.run.Run;

import java.util.Arrays;
import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run extends Student{
   
	public static void main(String[] args) {
		   
		Student[] sr = new Student[3];
		
		
		sr[0] = new Student("홍길동", 20 , 178.2, 70.0, 1, "정보시스템공학과");
		sr[1] = new Student("김말똥", 21 , 187.3, 80.0, 2, "경영학과");
		sr[2] = new Student("감개순", 23 , 167.0, 45.0, 4, "정보통신공학과");
		
        //학생 정보 모두 출력
		
		for(Student std : sr) {
			System.out.println(std.information());
		}
		
		System.out.println("===========================================");
		
		Employee[] emps = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int num = 0;
		
		while(true) {
			
			System.out.println("정보 입력");
			
			System.out.println();
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.printf("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
		emps[count]= new Employee(name, age, height, weight, salary, dept);
		count++;
			
			
			System.out.print("계속 추가 하시겠습니까?  : ");
			
			char ch = sc.next().charAt(0);
			
			if(ch =='y' || ch == 'Y') {
				
			}else {
				break;
			}
			
			
			
		}
	    
		
		
		//기록된 사원들의 정보를 출력
	
		
		for(int i = 0; i < count; i++) {
			System.out.println(emps[i].information());
		}
		
		
		
		
	}
}
