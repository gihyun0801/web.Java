package edu.kh.practice.snack.controller;

import edu.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	Snack v1 = new Snack();
	
 public SnackController() {
	 
 };
 
 public String saveDate(String kind, String name, String flavor, int numOf, int price) {
	 
	 
	 v1.setKind(kind);
	 v1.setName(name);
	 v1.setFlavor(flavor);
	 v1.setNumOf(numOf);
	 v1.setPrice(price);
	 
	 
	 return "저장완료";
 }
 


public String confirmDate() {
	 return v1.getKind() + "("+ v1.getName() + " - " + v1.getFlavor() + ")" + v1.getNumOf() + " 개 " + v1.getPrice()
+ " 원 "; }

	
}
