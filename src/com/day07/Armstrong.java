package com.day07;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		int cub=0;
		int original_num=num;
		
		while(num>0) {
			int r=num%10;
			cub=cub+(r*r*r);
			num = num/10;
		}
		if(original_num==cub) 
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not Armstrong");
		}

	}

}
