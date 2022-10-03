package com.day.Constructor;

public class Call {
	
	//cons 1
	protected Call() {
		this("Bhau");                 // calling constructor
		System.out.println("1 st constructor");
		 
	}
	//cons 2
	public Call(String s) {
	
		System.out.println("2 nd constructor"+s);
	}
	
	
	
	
	public static void main(String[] args) {
		Call c=new Call();
		
	}

}
