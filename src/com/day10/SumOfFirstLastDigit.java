package com.day10;

import java.util.Scanner;

public class SumOfFirstLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		int first=0;
		int last=0;
		
		last=num%10;
		
		while(num!=0) {
			first=num%10;
			num=num/10;
		}
		
		System.out.println(first+last);
		

	}

}
