package edu.kh.todoList.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import edu.kh.todoList.model.dto.Todo;
import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;

//보여지는 부분 (내용 출력/키보드 입력)
public class TodoListView {
	//필드 부분
	
	private BufferedReader br = null; //키보드 입력 스트림 참조 변수
	private TodoListService service = null;// 서비스 참조 변수
    
	
	//기본생성자
	
	public TodoListView() {
		
		//객체 생성 시 발생되는 예외를 여기서 모아서 처리할 예정
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			//부모타임 참조변수 = 자식 객체
			service = new TodoListServiceImpl(); //업캐스팅
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	//------------------------------------------------------------------------
	
	
	/**
	 * TodoList 프로그램 시작 화면
	 * 
	 */
	public void startView() {
			int input = 0;		// 선택한 메뉴 번호 저장
			
			
			do {
				
				
				
				try {
					input = selectMenu();
					
					switch(input) {
					
					case 1: todoListFullView(); break;
					case 2: /*todoDetailView()*/; break;
					case 3: /*todoAdd()*/; break;
					case 4: /*todoComplete()*/; break;
					case 5: /*todoUpdate()*/ break;
					case 6: /*todoDelete()*/ break;
					case 0:  System.out.println("프로그램 종료"); break;
					default : System.out.println("메뉴에 작성된 번호만 입력해주세요"); break;
					
					}
					
					System.out.println("===========================================");
					
				}catch(Exception e) {
					input = -1;
					e.printStackTrace();
				}
				
				
				
			}while(input != 0);
			
			
	}
	
	/** 메뉴 출력 및 선택
	 * @return 선택한 메뉴 번호 반환
	 */
	public int selectMenu() throws IOException, NumberFormatException{
		
		System.out.println("\n======================Todo List===========================\n");
         
		System.out.println("1. Todo List Full view");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo delete");
		System.out.println("0. EXIT");
		
		System.out.print("select menu number : ");
		
		int number = Integer.parseInt(br.readLine());
		System.out.println();
		return number;
		
	}
	
	
	
	//==============================================================
	
	public void todoListFullView() {
		
		System.out.println("\n==============[1. Todo List Full View]==============]\n");
		
		//할 일 목록 + 완료된 개수 카운트한 값 얻어오기
		
		// (List)        (int) 
		
		Map<String, Object> map = service.todoListFullView();
		 
		List<Todo> todoList = (List<Todo>)map.get("todoList");
		int completeCount = (int)map.get("completeCount");
		
		//출력 
		
		System.out.printf("[ 완료된 Todo 개수 / 전체 Todo 수 : %d / %d ]\n"
				, completeCount, todoList.size());
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-3s %10s   %10s     %s\n", "인덱스", "등록일", "완료여부", "할 일 제목");
		System.out.println("--------------------------------------------------------------------");
		
		for(int i=0; i < todoList.size(); i++) {
		
			String title = todoList.get(i).getTitle();
			
			String completeYN = todoList.get(i).isComplete() ? "O" : "X";
			
			String regDate = service.dateFormat(todoList.get(i).getReDate());
			
			System.out.printf("[%3d]  %20s    (%s)       %s\n", i, regDate, completeYN, title);
		}


	}
	
}
