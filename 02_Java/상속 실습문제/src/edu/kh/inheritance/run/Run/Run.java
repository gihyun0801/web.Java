package edu.kh.inheritance.run.Run;

import edu.kh.inheritance.model.dto.Phone.BasicPhone;
import edu.kh.inheritance.model.dto.Phone.SmartPhone;

public class Run {
   
	public static void main(String[] args) {
		
		SmartPhone s1 = new SmartPhone("Samsung", "GalaxyS20", 2020,1200000, "Android", 128);
		
	    s1.printInfo();
		
		
		BasicPhone b1 = new BasicPhone("Nokia", "3310", 2000, 100000, true);
		
		b1.checkKeyboard();
		
		
		
		
	}
	
	
}
