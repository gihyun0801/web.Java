package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {

	
	public void practice1() {
		
	String[][] arr = new String[3][3];
	 
	
     for(int i = 0; i < arr.length; i++) {
    	 for(int k = 0; k < arr[i].length; k++) {
    		 arr[i][k] = "(" + i + "," + k +")";
    	 }
     }
     
     for(int i = 0; i < arr.length; i++) {
    	 for(int k = 0; k < arr[i].length; k++) {
    		 System.out.print(arr[i][k]);
    	 }
    	 System.out.println();
     }
	 
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
		
		for(int i = 0; i < arr.length; i++) {
			for(int k =0; k <arr[i].length; k++) {
			
				System.out.printf("%2d ", arr[i][k]);
			
			}
			System.out.println();
		
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
		
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				System.out.printf("%2d ", arr[i][k]);
			}
			
			System.out.println();
		}
		
	}
	
	
	public void practice4() {
		
		
		int[][] num = new int[4][4];
		
		
		int col = num[0].length -1 ;
		int row = num.length - 1;
		
		for(int i = 0; i < row; i++) {
			for(int k = 0; k < col; k++) {
				int random = (int)Math.floor(Math.random() * 10 + 1);
				
				num[i][k] = random;
				
				num[i][3] += num[i][k];
				num[3][k] += num[i][k];
			}
		}
		
	
		
	
		
		for(int i = 0; i < num.length; i++) {
			for(int k = 0; k < num[i].length; k++) {
				System.out.printf("%5d", num[i][k]);
				if(i  == 3 || k == 3 ) {
					num[3][3] += num[i][k];
					
				}
				
		}
			System.out.println();
		};
		
		

				
				
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int num1 = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int num2 = sc.nextInt();
		

		if(!(num1 <= 10 && num1 >= 1 && num2 >= 1 && num2 <= 10)) {
			System.out.println("1 ~ 10 사이 숫자를 입력");
			return;
		}else {
			char[][]ch = new char[num1][num2];
			
			
			for(int i = 0; i < ch.length; i++) {
				for(int k = 0; k < ch[i].length; k++) {
					char  random= (char)Math.floor(Math.random() * 26 + 65);
					ch[i][k] = random;
					
				}
			}
			
			for(int i = 0; i < ch.length; i++) {
				for(int k = 0; k < ch[i].length; k++) {
					System.out.print(ch[i][k]  + " ");
				}
				System.out.println();
			}
			
		}
		
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int num = sc.nextInt();
		
		char[][] ch= new char[num][];
		
		int count = 0;
		
		for(int i = 0; i < ch.length; i++) {
			System.out.printf("%d 열의 크기 : ", i);
			int num2 = sc.nextInt();
			ch[i] = new char[num2];
			
			
		}
		
		
		for(int i = 0; i < ch.length; i++) {
			for(int k = 0; k < ch[i].length; k++) {
				ch[i][k] = (char)('a' + count);
						count++;
			}
		}
		
		for(int i = 0; i < ch.length; i++) {
			for(int k = 0; k < ch[i].length; k++) {
				System.out.print(ch[i][k] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice7() {
		
		String[] Student = {"강건강", "남나나", "도대담", "류라라",
				"문미미","박보매","송성실","윤예의","진재주",
				"차전축","피풍표","흥하하"};
		
		String[][] aa1 = new String[3][2];
		String[][] gg1 = new String[3][2];
		
		int ya = 0;
		int sa = 0;
		System.out.println("1분단");
	  int count = 0;
		
		for(int i = 0; i < aa1.length; i++) {
			
			for(int k = 0; k < aa1[i].length; k++) {
				  aa1[i][k] = Student[count];
				  count++;
			}
			
		}
		System.out.println(Arrays.deepToString(aa1));
		
		System.out.println("2분단");
		
		
		
		for(int i = 0; i < gg1.length; i++) {
			for(int k = 0; k < gg1[i].length; k++) {
				gg1[i][k] = Student[count];
				count++;
			}
		}
		
		
		
		
		
		
		
		
		
	
	
		System.out.println(Arrays.deepToString(gg1));
	
		
		//xxx
}
	
	public void practice8() {
		String[] Student = {"강건강", "남나나", "도대담", "류라라",
				"문미미","박보매","송성실","윤예의","진재주",
				"차전축","피풍표","흥하하"};
		
		String[][] aa1 = new String[3][2];
		String[][] gg1 = new String[3][2];
		
		int ya = 0;
		int sa = 0;
		System.out.println("1분단");
	  int count = 0;
		
		for(int i = 0; i < aa1.length; i++) {
			
			for(int k = 0; k < aa1[i].length; k++) {
				  aa1[i][k] = Student[count];
				  count++;
			}
			
		}
		System.out.println(Arrays.deepToString(aa1));
		
		System.out.println("2분단");
		
		
		
		for(int i = 0; i < gg1.length; i++) {
			for(int k = 0; k < gg1[i].length; k++) {
				gg1[i][k] = Student[count];
				count++;
			}
		}
		
		System.out.println(Arrays.deepToString(gg1));
		
		
		System.out.println("===================================================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String str = sc.next();
		
		int a1 = 1;
		int b1 = 2;
		
		for(int i = 0; i < aa1.length; i++) {
			for(int k = 0; k < aa1[i].length; k++) {
				
				if(aa1[i][k].equals(str)) {
					
					
					if(k == 0) {
						System.out.printf("검색하신 %s 학생은 : %d분단 %d번째 줄 왼쪽에 있습니다",str, a1, i + 1);
					}else if(k == 1) {
						System.out.printf("검색하신 %s 학생은 : %d분단 %d번째 줄 오른쪽에 있습니다",str, a1, i + 1);
					}
				}
				
			}
		}
		for(int i = 0; i < gg1.length; i++) {
			for(int k = 0; k < gg1[i].length; k++) {
				
				if(gg1[i][k].equals(str)) {
					
					
					if(k == 0) {
						System.out.printf("검색하신 %s 학생은 : %d분단 %d번째 줄 왼쪽에 있습니다",str, b1, i + 1);
					}else if(k == 1) {
						System.out.printf("검색하신 %s 학생은 : %d분단 %d번째 줄 오른쪽에 있습니다",str, b1, i + 1);
					}
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
	
	}
	
	public void practice9() {
		
		String [][] arr = new String[6][6];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 인덱스 입력 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("열 인덱스 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			arr[0][i + 1] = i + "";
			arr[i +1][0] = i + "";
			
		}
		
	   arr[num1 + 1][num2 + 1] = "x";
		
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				
				if(arr[i][k] == null) {
					arr[i][k] = "";
				}
				
				
				System.out.printf("%5s", arr[i][k]);
			}
			System.out.println();
		}
		
	
		
		
			
             
			
		
		
		
		
	}
	
	public void practice10() {
		
	}

	
	
	
	
	
	
	
	//xxxxxxxx
}
			
			
			
		
				
				
				
	
	
		

	
	
	
	
	
	
	

	

