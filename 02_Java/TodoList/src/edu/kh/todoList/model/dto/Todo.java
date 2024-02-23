package edu.kh.todoList.model.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

//스트림 입출력을 위한 직렬화
public class Todo implements Serializable{
      
	private String title; //할 일 제목
	private String detail;//상세 내용
	private boolean complete; //완료 여부
	private LocalDateTime reDate; // 등록날짜
    
	
	//java.time 패키지
	//LocalDateTime : 날짜, 시간을 나타내는 클래스
	//LocalDateTime.now() : 현재 시간 반환
	public Todo() {}


	public Todo(String title, String detail, boolean complete, LocalDateTime reDate) {
		super();
		this.title = title;
		this.detail = detail;
		this.complete = complete;
		this.reDate = reDate;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public boolean isComplete() {
		return complete;
	}


	public void setComplete(boolean complete) {
		this.complete = complete;
	}


	public LocalDateTime getReDate() {
		return reDate;
	}


	public void setReDate(LocalDateTime reDate) {
		this.reDate = reDate;
	}


	
	@Override
	public String toString() {
		return "Todo [title=" + title + ", detail=" + detail + ", complete=" + complete + ", reDate=" + reDate + "]";
	}
	
	
	
	
}
