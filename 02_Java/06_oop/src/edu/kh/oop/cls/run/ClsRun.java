package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;
import edu.kh.oop.cls.model.vo.Student;


public class ClsRun {
 public static void main(String[] args) {
	 Student sr = new Student();
	 // 매개변수 없는 생성자 -> 기본생성자라고 한다
	 // clsService의 기본생성자가 작성되어 있지 않지만
	 // 문제없이사용o
	 // 왜?
	 // 컴파일러가 코드를 번역할때
	 // 클래스 내부에 생성자가 하나도 없다면
	 // 자동으로 기본생성자를 추가해줌(우리눈에 안보임)
	 
	 ClsService clsService = new ClsService();
//	clsService.ex3();
	clsService.ex4();
} 
}
