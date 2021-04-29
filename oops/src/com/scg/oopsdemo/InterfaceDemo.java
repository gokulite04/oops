package com.scg.oopsdemo;

interface Printable{
	void print();
	int c=10;
}
interface Showable{
	void show();
}
class Display implements Printable,Showable{
	public void print() {
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
	    Display obj = new Display();  
	    obj.print();  
	    obj.show();  
	         }  
}