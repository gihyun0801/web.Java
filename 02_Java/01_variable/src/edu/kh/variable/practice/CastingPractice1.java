package edu.kh.variable.practice;

public class CastingPractice1 {
    public static void main(String[] args) {
    	int iNum1 = 10;
    	int iNum2 = 4;
    	iNum2 = 8;
    	float fNum = 3.0f;
    	
    	double dNum = 2.5;
    	
    	char ch = 'A';
    	
    	System.out.println( iNum1 - iNum2);
    	System.out.println((int)(dNum - 0.5));
    	
    	dNum -= 0.5; 
    	
    	System.out.println(iNum2 + dNum);
    	System.out.println((double)iNum1);
    	
    	
    	
    	System.out.println((iNum1 - iNum2) + 0.5);
    	System.out.println(dNum + 0.5);
    	
    	System.out.println((int)fNum);
    	System.out.println((int)(iNum1 - fNum - 4));
    	
    	System.out.println((((double)iNum1 - 4) - fNum) + 0.3333333);
    	System.out.println((((double)iNum1 - 4) - fNum) + 0.33333333333333335);
    	
    	System.out.println(ch);
    	System.out.println((int)ch);
    	System.out.println((int)ch + iNum1);
    	System.out.println((char)((int)ch + (iNum1 + 32)));
    	
    	final int AS = 10;
    	
    	System.out.println(AS);
    	
    	//107
    	
    	
    	
    }
}




    	
    	
