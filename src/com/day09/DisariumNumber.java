package com.day09;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		int n=num;
		int t=n;
		int power=0;
		int value;
		int sum=0;
		while(num>0) {
			power++;
			num=num/10;
			
		}
		System.out.println(power);
		while(n>0) {
			rem=n%10;
			value=(int)Math.pow(rem, power);
			power--;
			sum=sum+value;
			n=n/10;
			
		}
		if(sum==t) {
			System.out.println("Disarium");
		}
		else {
			System.out.println("Not Disarium");
		}

	}

}
