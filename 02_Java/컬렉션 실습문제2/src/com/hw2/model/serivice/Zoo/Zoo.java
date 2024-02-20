package com.hw2.model.serivice.Zoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal.Animal;



public class Zoo {
	
   
	private List<Animal> animals = new ArrayList<Animal>();
	
	private Scanner sc = new Scanner(System.in);
	
	public Zoo() {
		
		
		
		
	}
	
	public void addAnimal(Animal animal) {
		
		animals.add(animal);
		
	}
	
	public void showAnimals() {
		
		for(Animal em : animals) {
			 em.sound();
		}
		
	}
	
	public void displayMenu() {
		
		int menu = 0;
		
		
		do {
			
			try {
				System.out.println("****KH 동물원****");
				System.out.println("원하는 작업을 선택하세요 : ");
				System.out.println("1. 동물들의 울음소리 듣기");
				System.out.println("2. 종료");
				
				System.out.print("메뉴 선택 : ");
				
				menu = sc.nextInt();
				
				switch(menu) {
				case 1: showAnimals(); break;
				case 2 : System.out.println("프로그램 종료합니다"); break;
				default : System.out.println("범위가 초과했습니다");
				}
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("안녕하세요");
				menu = -1;
			}
			
				
				
				
			
			
			
					
			
			
			
			
		}while(menu != 2);
		
	}
	
}
