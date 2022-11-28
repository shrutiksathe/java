package com.day_Exception_Handling;

import java.util.Scanner;

class NegativeValueException extends Throwable{
	NegativeValueException(String s){
		super(s);
	}
}


public class customException {
	public static void check(int n) throws NegativeValueException {
		if(n < 0) {
		   throw new NegativeValueException("NUmber is -Ve");
		}
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Number:-");
		int n=sc.nextInt();
	  try {
		check(n);
		}
     catch(NegativeValueException e) {
    	 System.out.println(e.getMessage());
     }
	}

}
