package edu.kh.todoList.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.kh.todoList.model.dto.Todo;

public class TodoListDAOImpl implements TodoListDAO{

	
	private final String FILE_PATH = "C:/io_test/todoList.dat";
	
    private ObjectInputStream ois = null;
    private ObjectOutputStream oos = null;
    

    
    private List<Todo> todoList = null;

    
    
    public TodoListDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
    	//객체 생성 시 TodoList.dat 파일 내용 읽어오기
    	//-> 읽어오기 전에 있는지 검사부터!
    	
    	File file = new File(FILE_PATH);
    	
    	
    	
    	if(file.exists()) {
    		
    		
    		try {
    			// 객체 입력 스트림을 이용해서 입력 받기
    			ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
    			
    			//읽어온 객체를 ArrayList<Todo>로 강제 형변환 (다운캐스팅)
    			
    			todoList = (ArrayList<Todo>)ois.readObject();
    			
    			
    			
    		}finally {
    			if(ois != null)  ois.close();
    		}
    		
    		
    		
    		
    	} else {
    		
    		File directory = new File("C:/io_test");
    		
    		if(!directory.exists()) {
    			directory.mkdirs();
    		}
    		
    		//객체 출력 스트림을 이용해서 파일 생성 + 샘플 데이터 추가
    		todoList = new ArrayList<Todo>();
    		
    		todoList.add(new Todo("자바 공부", "수업 내용 복습하기", false, LocalDateTime.now()));
    		todoList.add(new Todo("혼자공부하는자바스크립트", "혼자 해보기", false, LocalDateTime.now()));
    		todoList.add(new Todo("AirplaneMode", "해쉬스완", false, LocalDateTime.now()));
    		
    		try {
        		//객체 출력 스트림 생성 -> 파일이없다면 자동 생성
        		
    			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
    			oos.writeObject(todoList);
    			
        	}finally {
        		
        	if(oos != null)	oos.close();
        		
        	}
    		
    		System.out.println("===TodoList.dat 파일 생성 완료");
    			
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    }



	@Override
	public List<Todo> todoListFullView() {
		
		
		
		
		return todoList;
	}
    
	
}
