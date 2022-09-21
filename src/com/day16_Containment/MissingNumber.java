package com.day16_Containment;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Series till 7:-");
		int num=sc.nextInt();
		 System.out.println();
		int sum=0,originalsum=28,result;
		while(num>0) {
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		result=originalsum-sum;
		System.out.println("The Missing NUmber is:-"+result);
		
	}

}
