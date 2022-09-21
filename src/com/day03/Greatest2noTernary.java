package com.day03;

import java.util.Scanner;

public class Greatest2noTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first Number: ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter the Second number: ");
		int n2=sc.nextInt();
		
		
//		String result= n%2==0? "Even" :"Odd";
//		System.out.println(result);
		
		 String result= n1>n2? "The Greatest number is :"+n1 :"The Greatest Number is :"+n2;
		 System.out.println(result);
		

	}

}
