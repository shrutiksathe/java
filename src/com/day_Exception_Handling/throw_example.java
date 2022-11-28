package com.day_Exception_Handling;

public class throw_example {
	public static void isValid(int n) {
		if(n<18) {
			throw new ArithmeticException("invalid number");
		}
		else {
			System.out.println("Valid");
		}
		System.out.println("hii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		isValid(10);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
