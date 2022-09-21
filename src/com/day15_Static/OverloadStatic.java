package com.day15_Static;

public class OverloadStatic {
	 static void add(int a , int b) {
		System.out.println("Addition:-"+(a+b));
     }
	 static void add(int a,int b,int c) {
		 System.out.println("Addition:-"+(a+b+c));
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2,2);
		add(2,2,2);

	}

}
