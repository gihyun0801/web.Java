package edu.kh.array2.practice;

import java.util.Arrays;

public class Array2Practice {

	
	public void practice1() {
		
	String[][] arr = new String[3][3];
	 
	 for(int i = 0; i < arr.length; i++) {
		 for(int k = 0; k < arr[i].length; k++) {
			 arr[i][k] = (  + i + ","+ k );
			
		 }
		
	 }

;

	 

	}
	
	
	
	
	public void practice2() {
		
		
		int count = 0;
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k ++) {
				count++;
				arr[i][k] = count;
			}
		
		}
		
		
		
	}
	
	
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int count = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length ; k++) {
				 arr[i][k] = count;
				 count--;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
	
	
	public void practice4() {
		int[][] arr = new int[4][4];
		
		
		
		
		
		for(int i = 0; i < arr.length; i++) {
			int result = 0;
			
			for(int k = 0; k < arr[i].length; k++) {
				int random = (int)Math.floor(Math.random() * 10 + 1);
				arr[i][k] = random;
				
				
				
				for(int j = 0; j <= 2; j++) {
					result += arr[i][j]; 
				}
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
}
