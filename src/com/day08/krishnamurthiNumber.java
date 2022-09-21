package com.day08;

import java.util.Scanner;

public class krishnamurthiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		/*int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);*/
		
		int temp=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
			
		}
		System.out.println(sum);
		n=temp;
		if(sum==n) {
			System.out.println("krishnamurthi");
		}
		else {
			System.out.println("Not khrishnamurthi");
		}
		

	}

}
