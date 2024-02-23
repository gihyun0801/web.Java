package edu.kh.todoList.model.service;

import java.time.LocalDateTime;
import java.util.Map;

public interface TodoListService {

  //할 일 목록 반환 서비스
	//return todoList + 완료개수
	
  public abstract Map<String, Object> todoListFullView(); //추상메서드

  
  
/** 날짜 포맷을 변환해서 반환
 * @param reDate
 * @return yyyy-MM-dd MM : mm : ss 형태 날짜 반환
 */
public abstract String dateFormat(LocalDateTime reDate);
  
		
}
