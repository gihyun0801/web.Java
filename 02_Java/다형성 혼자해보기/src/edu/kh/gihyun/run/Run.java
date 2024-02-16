package edu.kh.gihyun.run;

import edu.kh.gihyun.Animal.Animal;
import edu.kh.gihyun.Animal.Person;

public class Run {
 public static void main(String[] args) {
	   
	 Animal[] a1 = new Animal[1];
	 
	 a1[0] = new Person("밥", "도구", "ㅁㅁ");
	 
	
	 for(Animal bb : a1) {
		 System.out.println(bb.toString());
		 
	 }
	 
	 
}
}
