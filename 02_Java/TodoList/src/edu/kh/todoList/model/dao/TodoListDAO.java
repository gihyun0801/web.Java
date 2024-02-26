package edu.kh.todoList.model.dao;

import java.util.List;

import edu.kh.todoList.model.dto.Todo;

//외부 장치랑 접근하는 역할
public interface TodoListDAO {

	//할 일 목록 반환
	//return todoList
	public abstract List<Todo> todoListFullView();

		public void saveFile();
	//필드

		public abstract boolean todoComplete(int index);

		public abstract void add(String title, String result);

		public abstract void update(int num, String title, String result);

		public abstract boolean delete(String title);
	

	
	
	
	
	
	
}
