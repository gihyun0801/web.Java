package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {
	/*
	 * ObjectInputStream / ObjectOutputStream
	 * 
	 * Java 객체 를 인스턴스라고 부른다 
	 * 얘네를 입출력할떄 사용하는 바이트기반
	 * 보조 스트림
	 * (보조 스트림은 단독 사용 불가능)
	 * 
	 * 
	 * *** 직렬화(Serializable) ***
	 * - 객체를 직렬 형태로 변환
	 * 
	 * 
	 * */
   
	
	 /**
	 * 
	 * 객체를 외부 파일로 출력
	 * 
	 * 
	 * 
	 */
	public void objectOuput() {
		 
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			// .dat 확장자 : data를 담고 있는 파일을 나타내는 확장자
			fos = new FileOutputStream("C:/Users/user1/Desktop/자바/"
					+ "web.Java/02_Java/io_test/20240222/Member.dat");
			oos = new ObjectOutputStream(fos);
			
		    //Member 객체 생성
			
			Member member = new Member("member01", "pass01!", "김회원" , 30);
			
			// ObjectOutputStream 을 이용해서 Member 객체를 출력하기
			
			oos.writeObject(member); // 객체를 출력
			
			System.out.println("회원 출력 완료");
			
			// 이렇게만 하면 java.io.NotSerializableExceptio
			// 이런오류가 뜨는데 Member 라는 객체를 생성하고
			// oos라는 객체를 출력하는 보조스트림을 이용해서 콘솔에 띄우려고하지만
			// 직렬화가 되지 않았기 떄문에 이렇게만 작성하면 오류가 뜬다
			// 인스턴스로 직접가서 직렬화를 해줘야된다
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(oos != null) {
					oos.close(); // 얘도 IoException 발생해서 try catch문 ㄱㄱ
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
		 
		 
		 
		 
		 
		 
	 }
	
	
	public void objectInput() {
		
		ObjectInputStream ois = null;
		FileInputStream  fos = null;
		
		try {
			
			fos = new FileInputStream("C:/Users/user1/Desktop/자바/web.Java/02_Java/io_test/20240222/Member.dat");
			ois = new ObjectInputStream(fos);
			
			
			//스트림을 이용해 파일에 작성된
			//직렬화된 Member 객체를 읽어와
			//역직렬화를 수행하여 정상적인 Member 객체로 변환
			
			//ois.readObject() : 직렬화된 객체를 읽어와 역직렬화 == 얘는 반환형이 object
			//그래서 다운캐스팅 해줘여됨
		              Member m = (Member)ois.readObject();
		              
		              System.out.println(m);
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			
			try {
				
				if(ois != null) {
					ois.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
	}
	
	
	
}
