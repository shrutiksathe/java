package com.day.Interface;

interface drwable{
	static void m1() {
		System.out.println("Interface method");
	}
}
class Z implements drwable{
	static void m1() {
		System.out.println("class method");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
