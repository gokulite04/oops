package com.scg.oopsdemo;

abstract class Bike{  
	
	 Bike(){
		    System.out.println("bike is created");
		    int b=10;
	 }  
	 abstract void run();
	   
	 void changeGear(){
		 System.out.println("gear changed");
	 }  
 }  
//Creating a Child class which inherits Abstract class  
class Honda extends Bike{  
	 void run(){
		 System.out.println("running safely..");
	 } 
 }  

public class AbstractDemo {

	public static void main(String[] args) {
		
		Bike obj = new Honda();  
		  obj.run();  
		  obj.changeGear();  

	}

}
