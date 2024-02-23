package edu.kh.gihyun.Service;

import java.io.File;
import java.io.IOException;

public class Service {
   
	
	 
	public void ex1() throws IOException {
		
		File file = new File("C:\\Users\\user1\\Desktop\\file\\벚꽃");
		
		
		
		if(!file.exists()) {
			file.mkdirs();
			
			
		}
		
		
		
		
		
		
		
	}
	
	public void ex2() throws IOException {
		
		File file = new File("C:\\Users\\user1\\Desktop\\file\\벚꽃\\벚꽃.txt");
		
		
		
		if(!file.createNewFile()) {
			file.createNewFile();
			
			
		}
		
		
		
		
		
		
		
	}
	
	 
	 
	 
	
}
