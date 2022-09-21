package com.day06;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int orig = num;
		int sum=0;
		while(num>0) {
			int r=num%10;
			sum=sum*10+r;
			num=num/10;
			
		}
		if(orig==sum) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
		

	}

}
