package edu.kh.gihyun.service;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;

import edu.kh.gihyun.Person.Person;

public class Service {
   
	 public void Input() {
		
		 
		 StringBuilder str = new StringBuilder();
		 
		 str.append("안녕하세요");
		 
		 
		 FileWriter fw = null;
		 BufferedWriter bw = null;
		   
			 String content = str.toString();
			 
			 
			 
			 try {
				 
				 fw = new FileWriter("C:\\Users\\user1\\Desktop\\자바\\web.Java\\02_Java\\io_test\\20240222/호미들.txt");
				 bw = new BufferedWriter(fw);
				 
				 bw.write(content);
				 
				 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 
			 try {
				 
				 if(bw != null) {
					 bw.close();
				 }
				 
				 
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
			 
		 }
		 
		 
		 
		 
		 
	 }
	
	 
	 
}
