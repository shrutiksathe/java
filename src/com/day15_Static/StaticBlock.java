package com.day15_Static;

public class StaticBlock {
	static {
		System.out.println("Block1");     //execute first
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");  //execute after static block
		
		
	}
	static {
		System.out.println("Block2");      //execute first
	}

}
