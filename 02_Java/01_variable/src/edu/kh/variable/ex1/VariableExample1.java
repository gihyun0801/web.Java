package edu.kh.variable.ex1;

public class VariableExample1 {
   public static void main(String[] args) {
	    // 생성된 .java 파일과 class 오른쪽에 작성된 이름은 같아야 한다.
	   
	   System.out.println(2 * 3.141592653589793 * 5);
	   System.out.println(3.141592653589793 * 5 * 5);
	   System.out.println(3.141592653589793 * 5 * 5 * 20);
	   System.out.println(3.141592653589793 * 5 * 4);
	   
	   /*
	    * 변수 (Variable)
	    *  - 메모리(RAM)에 값을 기록하는 공간
	    *  -> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.
	    *  - 변수는 여러 종류 존재 (저장되는 값의 형태, 크기가 다름)
	    * 
	    * 
	    * 
	    * */
	   
	   double pi = 3.141592653589793;//원주율 
	   int r = 5; //반지름(radius)
	   int h = 20; //높이(height)
	   
	   System.out.println("-----------------------------------");
	   
	   System.out.println(2 * pi * r); //원의 둘레
	   System.out.println(pi * r * r); //원의 넓이
       System.out.println(pi * r * r * h);//원기둥의 부피
       System.out.println(4 * pi * r * r);//구의 겉넓이
   }
   
}