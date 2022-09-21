package com.day03;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Number=");
		int num= obj.nextInt();
		
		if(num%5==0) {
			System.out.println("The Number is Divisible by 5");
		}
		else
		{
			System.out.println("The number is not divisible by 5");
		}
		

	}

}
