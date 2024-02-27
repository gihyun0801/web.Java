package edu.kh.thread.test.run;

import edu.kh.thread.test.ThreadWithClass;
import edu.kh.thread.test.ThreadWithRunnable;

public class Run {
           // Thread(스레드) : 컴퓨터 프로그램 실행의 기본단위 중 하나
	       //                  프로세스 내에서 실행되는 흐름의 단위
	   
	  
	    public static void main(String[] args) {
			
	    	// Thread 클래스를 상속받아 구현하는 방법
	    	ThreadWithClass thread1 = new ThreadWithClass();
	    	
	    	// Runnable 인터페이스를 구현하는 방법
	    	// 
//	    	ThreadWithRunnable thread2 = new ThreadWithRunnable();
	    	
	    	Thread thread2 = new Thread(new ThreadWithRunnable());
	    	
	    	//Runnable 인터페이스에서 run 메서드 하나만을 정의하고 있기 때문에
	    	//start나 , stop과 같은 Thread 메서드를 사용할 수 없다
	    	//-> Thread 클래스에 Runnable인터페이스를 상속받아 구현한
	    	//ThreadWithRunnable 객체를 전달하여 사용해야 한다!
	    	
	    	thread2.start();
	    	
	    	
	    	thread1.start();//스레드의 실행
	    	
	    	//실무..
	    	//- 웹서버, 데이터베이스처리, 대규모 데이터처리 등..
	    	
		}
	 
	 		
	 
}
