package edu.kh.io.pack1.model.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileService {

	
	
	/* File 클래스
	 *
	 * - java.io 패키지
	 *
	 * - 파일/디렉토리(폴더)를 관리하는 클래스
	 *   (파일/디렉토리 존재 유무 관계 없음)
	 *  
	 * - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
	 *  
	 * - File 클래스 메서드
	 *
	 * boolean  mkdir()          : 디렉토리 생성
	 * boolean  mkdirs()         : 경로상의 모든 디렉토리 생성
	 * boolean  createNewFile()  : 파일 생성
	 * boolean  delete()         : 파일/디렉토리 삭제
	 * String   getName()        : 파일 이름 반환
	 * String   parent()         : 파일이 저장된 디렉토리 반환
	 * String   getPath()        : 전체 경로 반환
	 * boolean  isFile()         : 현재 File 객체가 관리하는게 파일이면 true
	 * boolean  isDirectory()    : 현재 File 객체가 관리하는게 디렉토리 true
	 * boolean  exists()         : 파일/디렉토리가 존재하면 true, 아님 false
	 * long     length()         : 파일 크기 반환
	 * long     lastModified()   : 파일 마지막 수정일 (1970.01.01 09:00 부터 현재까지 지난 시간을 ms 단위로 반환)
	 * String[] list()          : 디렉토리 내 파일 목록을 String[] 배열로 반환
	 * File[]   listFiles()     : 디렉토리 내 파일 목록을 File[] 배열로 반환
	 */


	
	
	/**
	 * File 클래스로 객체 생성
	 * 폴더가 존재하지 않으면 폴더 생성하는걸 만들어볼거다
	 * 
	 */
	public void method1() {
		
		
		// C:\io_test\20240222 폴더를 지정
		
		File directory= new File("../io_test/20240222");
		
		// 제일 앞 슬래쉬 / 이거는 최상위 폴더 또는 root 라고 얘기한다 절대경로의 기준점이라고 하면된다
		
		// 처음 : 존재하지 않는 폴더를 관리하는 File 객체 생성
		
		
		//존재여부확인
		System.out.println("존재 여부 확인  : " + directory.exists());
		
		if(!directory.exists()) { //폴더가 존재하지 않으면
			
			//폴더 모두 생성
			directory.mkdirs();
			
			System.out.println(directory.getName()); // 가장 꼴등에 있는 걸 반환 20240222
			System.out.println(directory.getPath()); //  전체 경로 ..\io_test\202402222
			
			System.out.println("존재 여부 확인  : " + directory.exists());
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	/**
	 * file 객체를 이용해서
	 * 지정된 위치에 파일 생성하기 
	 */
	public void method2() {
		
		File file = new File("\\io_test\\20240222\\파일.txt");
		
       
		try {
			
			if(!file.exists()) { //존재하지않으면
				
				if(file.createNewFile()) { // 파일 생성이 성공하면
					System.out.println(file.getName() + "파일이 생성 되었습니다");
				}
				
			}else {
				System.out.println(file.getName() + "은 이미 있습니다");
			}
			
		}catch(IOException e) {
			e.printStackTrace(); // 예외 정보 + 예외가 발생한 위치까지의 메서드 추적
		}
		
		
		
	
		
		
	}
	
	/**
	 * File 클래스 제공 메서드 활용하기
	 * 
	 */
	public void method3() {
		
		File directory = new File("C:\\Users\\user1\\Desktop\\자바\\web.Java\\02_Java\\12_Io");
		
		//지정된 디렉토리에 있는 모든 파일/ 디렉토리를 file[] 형태로 얻어오기

		File[] files = directory.listFiles();
		
		
		for(File f : files) {
			
			// File.toString() : 문자열로 변환해서 리턴 : 지정된 파일/디렉토리에 절대경로
//			System.out.println(f.toString());
			
			String fileName = f.getName();
			
			//마지막으로 수정한날짜
			
			Long lastModified = f.lastModified();
			
//			System.out.println(lastModified);
			
			//SimpleDateFormat : 간단히 날짜 형식을 지정할 수 있는 객체
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
			
			//SimpleDateFormat.format(long) : 
			// 매개변수 long 값을 지정된 패턴 형식으로 변화하여
			// 문자열 형태로 반환
			
			String date = sdf.format(lastModified);
			
//			System.out.println(date);
			
			
			
			//파일 유형
			
			String type = null;
			
			if(f.isFile()) {
				type ="파일";
			}else {
				type = "폴더";
			}
			
			//파일 크기 (byte)
			
			String size = f.length() + "B";
			
			if(f.isDirectory()) {
				size = "";
			}
			
			String result = String.format("%-20s, %-20s, %-5%s %10s", 
fileName, date, type,size);
			
			System.out.println(result);
			
		}
		
		
	}
	

	
	
	
	
	
}
