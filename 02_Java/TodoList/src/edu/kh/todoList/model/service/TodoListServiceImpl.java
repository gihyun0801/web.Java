package edu.kh.todoList.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dao.TodoListDAO;
import edu.kh.todoList.model.dao.TodoListDAOImpl;
import edu.kh.todoList.model.dto.Todo;

public class TodoListServiceImpl implements TodoListService{
    private TodoListDAO dao = null;
    
    public TodoListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
    	
    	//TodoListServiceImpl 객체가 생성될 때
    	//TodoListDaoImpl 객체 생성
    	
    	dao = new TodoListDAOImpl();
    	
    	
    	
    }

	@Override
	public Map<String, Object> todoListFullView() {
		
		// 1. 할 일 목록 DAO한테서 얻어오기
        
		List<Todo> todoList = dao.todoListFullView();
		
		// 2.할 일 목록에서 완료인 요소가 몇 개인지 카운트
		
		int completeCount = 0;
		
		
		for(Todo list : todoList) {
			
			if(list.isComplete()) {
				completeCount++;
			}
			
		}
		
		Map<String, Object > map = new HashMap<String ,Object>();
		map.put("todoList", todoList);
        map.put("completeCount", completeCount);
		
        
        //4. map 반환하기
		return map;
	}

	@Override
	public String dateFormat(LocalDateTime reDate) {
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		 // regDate에 저장되어있는 날짜 데이터를
		// formatter 에 저장된 형식으로 변경
		
		String fomatterDateTime = reDate.format(formatter);
		
		
		
		
		
		return fomatterDateTime;
	}
    
    
 }
