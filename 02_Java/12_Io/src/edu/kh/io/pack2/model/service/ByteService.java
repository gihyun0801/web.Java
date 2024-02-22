package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteService {
          
	/*
	 * 
	 * 스트림(Stream) : 데이터가 이동하는 통로
	 *                  기본적으로 한 방향으로 흐름
	 * 
	 * Byte 기반 스트림
	 * 
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * 
	 * - 최상위 인터페이스 : InputStream, OutputStream
	 *     
	 *     
	 *   - 문자열, 이미지, 영상, 오디오, pdf 등
	 *      모든 것을 입/출력 할 수 있음
	 *      (단, 통로가 좁다보니 속도가 느림)  
	 * 
	 *  
	 *  
	 *  Io 관련된 코드는 IoException이 발생될 가능성이 높다 
	 *  -> 거의 모든 메서드가 throws IoException
	 *  -> IoException 예외 처리 구문을 작성하는 것이 필수
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	/**
	 * 바이트 기반 파일 출력
	 */
	public void fileByteOutput(){
		
		
		// FileOutputStream 참조 변수 선언
		
		FileOutputStream fos = null;
		
		try {
			
//			-> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
//			-> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
//			-> (단 , 폴더는 생성 x 파일만 o)
// 			-> 기존 파일이 존재하면 내용을 덮어씌기함
			fos = new FileOutputStream("/io_test/20240222/바이트기반_테스트.txt");
			//연결통로                         //만든파일
//			   1byte
			
			
			//String 불변성 문제를 해결한 객체(가변성)
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("벚꽃은 잠깐이기에 더 아름답지\n");
			sb.append("우린 그렇게 피어올랐어\n");
			sb.append("그 색처럼 타올랐고 그처럼 흩날렷어");
			sb.append("영원한 건 없다는 너의 말 그럼 영원하지 않은거잖아\n");
			sb.append("너의 그 생각도 뭐 너무 멀리 왔으니\n");
			
			String str = sb.toString();
			
			//출력방법 1 : 한 글자(2byte) 씩 파일로 출력
			// -> 2byte 범주의 문자는 1byte 기반 스트림 통과 시
			// 데이터 손실 문자가 깨짐
			
//	출력방법 1		for(int i = 0; i < str.length(); i++) {
//				
//				char ch  = str.charAt(i);
//				fos.write(ch); // 1byte 출력 스트림이 연결된 파일에 ch를 쓰겟다
//				
//				//이렇게만 쓰면 지금 전달은안하고 중간과정이다 그래서 fos.flush() 로 밀어내야된다 데이터를
//				
//			}
			
			//System.nanoTime() : 1970.01.01 09 : 00 :00 부터
			//현재 시간까지의 차이를 ns 로 반환 나노세컨드
			//1ms = 1/1000초
			
			long StartTime = System.nanoTime();
			
// 출력방법 2
			
			// String 을 바이트 byte[] 변환 후 출력 문자열 에다가 .getBytes[]
		fos.write(str.getBytes());   // << 이 스트링을 byte배열로 바꿔준다			
			
			long endTime = System.nanoTime();
			
			System.out.println(endTime - StartTime + " 나노쒜컨드 ");
			
			
			fos.flush();
			
			System.out.println("출력완료");
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			
			// 사용 완료한 스트림을 제거 (닫기, 메모리 반환) 하는 코드 작성
			
			try {
				
				// 만약 통로가 생겻는지 안생겻는지 평가하는 if문
				if(fos != null) {
					fos.close();
				}
				
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	/**
	 * 
	 * 버퍼를 이용한 파일 출력
	 * -BufferedOutputStream 보조 스트림 이용 
	 *  
	 * 
	 */
	public void bufferFileByteOutput() {
		
		/*
		 * 버퍼 란 ?
		 * 데이터를 모아두는 박스, 장바구니 같은 메모리 공간
		 * 
		 * 버퍼링
		 * 인터넷 속도 낮음 + 스트리밍 코드가 효율이 안좋음
		 * -> 동영상 재생 중에 미리
		 * 앞에 재생될 부분을 다운 받아놔서
		 * 영상을 끊김없이 볼 수 있게 함
		 * -> 다운받아서 저장해놓은 공간 -- 버퍼
		 * 
		 * 
		 * BufferedOutputStream / BufferedInputStream
		 * 
		 *  - FileOutputStream 1 바이트 씩 데이터를 입풀력
		 *  - > 버퍼에 입출력할 내용을 모아서 한 번에 입출력!
		 *  
		 *   --> 스트림을 이용하는 횟수가 적어짐
		 *   -> 성능, 시간 효율 up
		 * 
		 * 
		 * */
	FileOutputStream fos = null;
	
	BufferedOutputStream bos = null; //보조 스트림 선언
		
		try {
			

			fos = new FileOutputStream("/io_test/20240222/바이트기반_테스트_Buffered.txt");
			
			// 기반 스트림 fos 를이용해
			// 보조 스트림 bos를 생성
			bos = new BufferedOutputStream(fos);
			// bos 는 보조스트림이기 떄문에 혼자 못씀
			

			
		
			StringBuilder sb = new StringBuilder();
			
			sb.append("벚꽃은 잠깐이기에 더 아름답지\n");
			sb.append("우린 그렇게 피어올랐어\n");
			sb.append("그 색처럼 타올랐고 그처럼 흩날렷어");
			sb.append("영원한 건 없다는 너의 말 그럼 영원하지 않은거잖아\n");
			sb.append("너의 그 생각도 뭐 너무 멀리 왔으니\n");
			
			String str = sb.toString();
			
			long StartTime = System.nanoTime();
			
			
		bos.write(str.getBytes());   	
			
			long endTime = System.nanoTime();
			
			System.out.println(endTime - StartTime + " 나노쒜컨드 ");
			
			
			bos.flush();
			
			System.out.println("출력완료");
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			
			
			try {
				
				if(bos != null) {
					bos.close();
					//원래 fos도 통로를 열여놧는데 왜 보조스트림만 통로를 닫냐
					// 보조를 도와줫던 주인도 닫힌다 자동적으로
				}
				
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}
	
	
	public void fileByteInput() {
		
		// 파일 입력용 바이트 기반 스트림
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("C:\\io_test\\20240222\\노래가사.txt");
			
			//방법 1 . 파일 내부 내용을 1byte 씩 끊어서 가져오기
			// ->2byte 범주의 글자들이 깨지는 문제들이 발생 한글 은 2byte
			
			// 자바에서 byte 는 정수형
			// -> 다루기 힘들기 때문에 정수 기본형인 int로 변환해서 사용
			
			int value = 0; // 읽어온 byte값을 저장할 변수
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				value = fis.read(); // 1byte씩 읽어오기
				//단 더 이상 읽어올 값이 없으면 - 1반환
				
				if(value == -1) {
					break; // 다 읽어왓으면 break 해라
					
					
					//읽어온 값을 StringBuilder에 추가
					
				}
					sb.append( (char)value ); // char형태로 강제형변환 해서 글자 형태로 추가
			}
			
			System.out.println(sb.toString());
			
			//INPUTsTREAM 은 읽어오는 값이 므로 밀어넣는 flush가 없음
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 사용완료된 stream 메모리 반환
			
			try {
				
				if(fis != null) {
					fis.close();
				}
				
			}catch(IOException e) {
				
			}
		}
		
		
		
		
	}
	
	
	
	
	
	public void fileByteInput2() {
		
		
		
		
		// 파일 입력용 바이트 기반 스트림
		
				FileInputStream fis = null;
				
				try {
					
					fis = new FileInputStream("C:\\io_test\\20240222\\노래가사.txt");
					
					// 방법 2 . 파일에 저장된 모든 byte 값을 다 읽어와
					// byte[] 형태로 반환 받기
					// -> 이 후 byte[] 배열을 이용해서 String 객체 생성
					//   String 생성 시 배열 요소 2개씩 묶어 한 글자로 해석해
					//        깨지는 글자 없이 문자열로 반환
					
					
					byte[] bytes = fis.readAllBytes();
					
					String str  = new String(bytes); // 알아서 bytes배열에 있는걸 문자열로 바꿔서 넣어줌
					
					System.out.println(str);
					
				}catch(IOException e) {
					e.printStackTrace();
				}finally {
					// 사용완료된 stream 메모리 반환
					
					try {
						
						if(fis != null) {
							fis.close();
						}
						
					}catch(IOException e) {
						
					}
				}
		
		
		
		
		
		
		
		
	}
	
	
	/**
	 * BufferedInputStream 보조 스트림을 이용한 성능 향상
	 * 
	 * 
	 * 
	 * 
	 */
	public void bufferedFileByteInput() {
		
		
		
		
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream("C:\\io_test\\20240222\\노래가사.txt");
			bis = new BufferedInputStream(fis);
			
			
			
			byte[] bytes = bis.readAllBytes();
			
			String str  = new String(bytes); 
			
			System.out.println(str);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(bis != null) {
					bis.close();
				}
				
			}catch(IOException e) {
				
			}
		}

		
		
		
	}
	
	
	
	
	
	/**
	 * 파일 경로를 입력 받아
	 * 지정된 파일과 같은 경로에 복사된 파일 출력하기
	 * 
	 * [실행화면]
	 * 파일 경로 입력 : /io_test/20240222/노래가사.txt
	 * 복사완료 : /io_test/20240222/노래가사.copy.txt
	 * 
	 * 1) 입력된 경로에 파일이 있는지 검사
	 * 
	 * 2) 있으면 파일 내용을 모두 읽어오기 : FileInputStream + BufferedInputStream
	 * 
	 * 3) 읽어온 내용을 같은 위치에 "파일명_copy " 이름으로 출력
	 *     : FileOutputStream + BufferedOutputStream
	 *     
	 *     Scanner 대신 BufferedReader 이용
	 *      
	 */
	public void fileCopy() {
		
		
		BufferedReader br = null; //문자열 입력용 스트림
		
		FileInputStream fis = null; //파일 입력
		
		BufferedInputStream bis = null; //입력 보조
		
		FileOutputStream fos = null; //파일 출력
		
		BufferedOutputStream bos = null; //출력 보조
      
		
		
		
		try {
			
			
			// 키보드 입력을 받기 위한 스트림 객체 생성
			 br =   new BufferedReader(new InputStreamReader(System.in));
			
			 
			 // 경로 입력 받기
			 
			 System.out.println("파일 경로 입력 : ");
			 String target =  br.readLine(); // 입력된 한 줄 읽어오기
			 
			 // 해당 경로에 파일이 존재하는지 확인
			 
			 File file = new File(target);
			 
			 if(!file.exists()) {
				 System.out.println("해당 경로에 파일이 존재하지 않습니다");
				 return;
			 }
			 
			 
			 //-----------------------------------------------
			 //target 이 가리키는 파일을 입력 받을 수 있도록
			 //입력용 스트림 생성
			 fis = new FileInputStream(target);
			 bis = new BufferedInputStream(fis);
			 
			 //입력용 스트림을 이용해서 target 입력 받기
			 
			 byte[] bytes = bis.readAllBytes();
			 
			 
			 //출력할 파일의 경로 + _copy가 붙은 파일 이름 
			 
			 StringBuilder sb = new StringBuilder();
			 
			 sb.append(target);
			 
			 //String.lastIndexOf("문자열") == 반환형 int
			 // - String 뒤에서 부터 검색해서
			 // 문자열 과 일치하는 부분의 인덱스 반환 
			 // 없으면 -1 반환 
			 
			 int insertPoint = target.lastIndexOf(".");
			 sb.insert(insertPoint, "_copy");
			 
			 String copy = sb.toString(); //복사할 파일의 경로
			 
			 // 출력용 스트림 생성
			 
			 fos = new FileOutputStream(copy);
			 bos = new BufferedOutputStream(fos);
			 
			 //읽어왓던 내용 bytes를 bos 를 이용해서 출력
			 
			 bos.write(bytes);
			 bos.flush();
			 
			 System.out.println("복사완료 : " + copy);
			 
			 
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(br != null) {
					br.close();
				}
				
				
				if(bis != null) {
					bis.close();
				}
				
				if(bos != null) {
					bos.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
