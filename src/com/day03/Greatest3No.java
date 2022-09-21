package com.day03;

import java.util.Scanner;

public class Greatest3No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The First Number :");
		int n1=sc.nextInt();
		System.out.print("Enter the Second number :");
		int n2=sc.nextInt();
		System.out.print("Enter the third number :");
		int n3=sc.nextInt();
		
		if(n1>=n2 && n1>=n3) {
			System.out.println("The Greatest number is :"+n1);
		}
		else if(n2>=n1 && n2>=n3) {
			System.out.println("The Greatest number is : "+n2);
		}
		else if(n3>=n1 && n3>=n2) {
			System.out.println("The Greatest number is : "+n3);
		}

	}

}
