package edu.kh.todoList.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import edu.kh.todoList.model.dao.TodoListDAO;
import edu.kh.todoList.model.dao.TodoListDAOImpl;
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
					case 2: todoDetailView(); break;
					case 3: todoAdd(); break;
					case 4: todoComplete(); break;
					case 5: todoUpdate(); break;
					case 6: todoDelete(); break;
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
		
		//우선, map.get("todoList")는 Map에서 가져온 값이기 때문에 컴파일러는 
//		이 값이 ArrayList인지 아니면 그보다 구체적인 타입인지 알 수 없습니다. 
//		따라서 컴파일러는 이 값을 ArrayList<Todo>로 다운캐스팅할 때 
//		그 타입이 맞는지 확실하지 않다고 판단하게 됩니다.
		
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
	
	
	public void todoDetailView() throws Exception{
		
		
		System.out.println("\n==============[2. Todo Detail View]==============]\n");
		List<Todo> list = service.detail();
		System.out.print("인덱스 번호 입력 : ");
		int num = Integer.parseInt(br.readLine());

		if(list.size() <= num || num < 0) {
			System.out.println("\n인덱스 범위 초과\n");
			return;
		}
		
		
		System.out.println("------------------------------------------------------");
		
		
		
		String title = list.get(num).getTitle();
		
		String regDate = service.detailLocal(list.get(num).getReDate());
		
		String ohx = list.get(num).isComplete() ? "O" : "x";
		
		String detail = list.get(num).getDetail();
		
		
		
		System.out.printf("제목 : %s\n", title);
		System.out.printf("등록일 : %s\n", regDate);
		System.out.printf("완료여부 : %s\n", ohx);
		
		System.out.println();
		
		System.out.println("[세부 내용]");
		System.out.println("-----------------------------------------");
		System.out.printf("%s\n",detail);
		
		
		
	}
    
	public void todoAdd() throws Exception{
		
		
		System.out.println("\n==============[3. Todo Add]==============]\n");
		
		System.out.print("제목 : ");
		String title = br.readLine();
		
		System.out.print("세부사항 wq 를 작성하면 그만추가: ");
		
		
	
		StringBuilder str = new StringBuilder();
	
		while(true) {
			
			String detail = br.readLine();
			
			
			if(detail.equals("wq")) {
				break;
			}
			
			
			str.append(detail);
			str.append("\n");
			
		}
		
		
		String result = str.toString();
		
		service.add(title, result);
	
		
		
		
	}

   public void todoUpdate() throws Exception{
	   
	   System.out.println("\n==============[5. Todo Update]==============]\n");
	   
	   List<Todo> list = service.detail();
	   
	   System.out.print("\n몇 번째 인덱스번호에 있는 걸 수정하시겠습니까 ? : ");
	   int num = Integer.parseInt(br.readLine());
	   
	   if(list.size() <= num) {
		   System.out.println("인덱스 범위 초과");
		   return;
	   }
	   
	   System.out.println("\n=============수정 전 내용================\n");
	   
	   
	   System.out.printf("\n제목 : %s  \n", list.get(num).getTitle());
	   System.out.printf("수정한 날짜 : %s\n", service.dateFormat(list.get(num).getReDate()));
	   System.out.printf("수정여부 : %b  \n", list.get(num).isComplete());
	   
	   System.out.println("----------------------------------------------------");
	   System.out.printf("\n[상세여부] : %s \n", list.get(num).getDetail());
	   
	   
	   
	   
	  System.out.println("----------------------------------------------------------");
	   
	  
	   
	   
	   
	   
	   System.out.print("\n수정할 제목 : ");
	   String title = br.readLine();
	   
	   System.out.println("수정할 세부사항 wq 입력시 종료 : ");
	  
	   StringBuilder str = new StringBuilder();
	   
	   
	   while(true) {
		   String detail = br.readLine();
		   
		   
		   if(detail.equals("wq")) {
			   break;
		   }
		   
		   str.append(detail);
		   str.append("\n");
		   
	   }
	   
	   String result = str.toString();
	   
	   
	   
	   service.update(num, title, result);
	   
	   
	   
	   System.out.println("\n=============수정 후 내용================\n");
	   
	   System.out.printf("\n제목 : %s  \n", list.get(num).getTitle());
	   System.out.printf("수정한 날짜 : %s\n", service.dateFormat(list.get(num).getReDate()));
	   System.out.printf("수정여부 : %b  \n", list.get(num).isComplete());
	   
	   System.out.println("----------------------------------------------------");
	   System.out.printf("\n[상세여부] : %s \n", list.get(num).getDetail());
	   
	    System.out.println("===========================================");
	   
	   
	   
   }
	
   
   public void todoDelete() throws Exception{
	   
	   System.out.println("\n==============[6. Todo delete]==============]\n");
	   
	   System.out.print("삭제할 내용의 제목을 입력해주세요 : ");
	   String title = br.readLine();
	   
	  
		   boolean nana = service.delete(title);
		   
		   if(nana) {
			   System.out.println("삭제완료");
			   
		   }else {
			   System.out.println("삭제실패");
		   }
			
		   
		   
	   }
	   
		   
		   
	   
	   
	   
	   
	   
   
	
   public void todoComplete() throws Exception{
	   
	   System.out.println("\n==============[4. Todo Complete]==============]\n");
	   
	   System.out.print("변경할 인덱스 번호 입력 : ");
	   int index = Integer.parseInt(br.readLine());
	   
	   boolean result = service.todoComplete(index);
	   
	   if(result) {
		   
		   System.out.println("\n저장완료");
	   }else {
		   System.out.println("\n저장실패");
	   }
	   
	   
	   
   }
   
}
