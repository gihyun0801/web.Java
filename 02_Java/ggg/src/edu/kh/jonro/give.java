package edu.kh.jonro;

import java.util.Arrays;
import java.util.Scanner;

public class give {
 
	 public void practice13(){
	        // 1. 사용자에게 문자열 입력받기
	    Scanner sc = new Scanner(System.in);
	    	 
	      System.out.print("문자열 : ");
	      String str = sc.next();
	      
	      char ch[] = new char[str.length()];
	      
	      for(int i = 0; i < str.length(); i++) {
	    	  ch[i] = str.charAt(i);
	      }
	      
	      
	      System.out.print("문자열에 있는 문자 : ");
	      int count = 0;
	      for(int i = 0; i < str.length(); i++) {
	    	  
	    	  boolean flag = true;
	    	  
	    	  for(int k = 0; k < i; k++) {
	    		  if(ch[i] == ch[k]) {
	    			  flag = false;
	    			  break;
	    		  }
	    	  }
	    	  
	    	  if(flag) {
	    		  if(i == 0) {
	    			  System.out.print(ch[i]);
	    		  }else {
	    			  System.out.print("," + ch[i]);
	    		  }
	    		  
	    		  count++;
	    	  }
	    	  
	      }
	      System.out.println();
	      System.out.printf("문자 개수 : %d", count);
	        
	        
	        
	    	 
	 }
	    
	 public void practice14() {
		 
	
		  Scanner sc = new Scanner(System.in);
		  System.out.print("배열의 크기를 입력하세요 : ");
		  int num = sc.nextInt();
		  sc.nextLine();
		  
		  String[] arr = new String[num];
		  
		  for(int i = 0; i < arr.length; i++) {
			  System.out.printf("%d번째 문자열 : ", i + 1);
			  String book = sc.nextLine();
		  }
		  
		  
		  while(true) {
			  
			  System.out.print("더 값을 입력하시겠습니까 ? : ");
			  char ch = sc.next().charAt(0);
			  
			  if(ch == 'y' || ch == 'Y') {
				  System.out.print("더 입력하고 싶은 개수 : ");
				  int addSize = sc.nextInt();
				  sc.nextLine();
				  
				  String[] result = new String[arr.length + addSize];
				  
				  for(int i = 0; i < result.length; i++) {
					  if(i < arr.length) {
						  result[i] = arr[i];
					  }else {
						  System.out.printf("%d 번째 문자열 : ", i + 1);
						  String shit = sc.nextLine();
						  
						  result[i] = shit;
					  }
				  }
				  
				  arr = Arrays.copyOf(result, result.length);
				  
			  }else {
				  break;
			  }
			  
			  
			  
			  //while
		  }
		  
		  System.out.println(Arrays.toString(arr));
		  
		  
		  
		  
		 
		 
	
		 
		 
		 
		 
		 
		 
		 
	 }
	    	 
	    	  
	    	  
	    	 
	 

	 
}
	

