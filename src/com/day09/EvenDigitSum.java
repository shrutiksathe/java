package com.day09;

import java.util.Scanner;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int r=num%10;
			 if(r%2==0) {
				 sum = sum+r;
			 }
			 num=num/10;
		}
		System.out.println(sum);

	}

}
