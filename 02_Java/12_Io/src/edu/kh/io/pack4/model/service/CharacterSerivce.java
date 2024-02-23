package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterSerivce {
   
	
	/*
	 * 문자 기반 스트림
	 *  - 2byte 문자(char) 단위로 입/출력 하는 스트림
	 * 
	 * 
	 *  -Reader(입력), Writer(출력) 최상위 인터페이스
	 *  
	 *  -문자만 작성된 파일, 채팅, 인터넷 요청 시 데이터 전달
	 *  
	 * 
	 * 
	 * 
	 * \
	 * */
	
	
	
	
	/**
	 * 문자 기반 파일 입력(파일 읽어오기)
	 * + 보조 스트림 Buffered 사용
	 */
	public void fileInput() {
		
		 FileReader fr = null ; // 문자 기반 파일 입력스트림
		 BufferedReader br = null; // 문자 기반 보조 스트림
		 
		 try {
			 
			 //문자 기반 스트림 생성
			 
			 fr = new FileReader("C:/Users/user1/Desktop/자바/web.Java/02_Java/io_test/20240222/노래가사.txt");
			 
			 br = new BufferedReader(fr);
			 
			 String line = null; // 한줄을 읽어와 저장할 변수
			 
			 while(true) {
				 
				 line = br.readLine(); // 한줄읽어온걸 line 에다 저장
				 
				 
				 if(line == null) {
					 break;
				 }
				 
				 System.out.println(line);
				 
			 }
			 
			 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 
			 
			 try {
				 
				 if(br != null) {
					 br.close();
				 }
				 
			 }catch(Exception e) {
				 
				 e.printStackTrace();
				 
			 }
			 
		 }
		 
		
	}
	 
	
	public void fileOutput() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("샤워한 듯이 풀려 힘이\n");
		sb.append("다 잃고 나서야 포기해\n");
		sb.append("영화 같아 우린 드디어\n");
		
		String content = sb.toString();
		
		//content에 저장된 문자열을
		
		FileWriter fiw = null;
		BufferedWriter bw = null;
		
		
		try {
			
			fiw = new FileWriter("C:/Users/user1/Desktop/자바/web.Java/02_Java/io_test/20240222/에어플레인.txt");
			bw = new BufferedWriter(fiw);
			
			
			bw.write(content);
			
			System.out.println("출력 완료");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				// close() 구문에 flush() 가 내장되어있음
				if(bw != null) {
					bw.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	 
}
