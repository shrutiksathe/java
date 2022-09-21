package com.day03;

import java.util.Scanner;

public class Greatest3noTernary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int b=sc.nextInt();
		System.out.println("Enter the third Number : ");
		int c=sc.nextInt();
		
	 String result = (a>b) ?(a>c ? "Greatest"+a : "Greatest"+c):(b>c?"greatest"+b:"gratest"+c);
     System.out.println(result);
	}

}
