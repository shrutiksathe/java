package com.day04;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number :");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number :");
		int b=sc.nextInt();
		
		System.out.print("Enter the operation (+ , - , * , / , %) :");
		char ch =sc.next().charAt(0);
		
		switch(ch) {
		case '+':System.out.println("Addition:"+(a+b));
		break;
		case '-':System.out.println("Substraction:"+(a-b));
		break;
		case '*':System.out.println("Multiplication:"+(a*b));
		break;
		case '/':System.out.println("Division:"+(a/b));
		break;
		case '%':System.out.println("Mod:"+(a%b));
		}
		
		

	}

}
