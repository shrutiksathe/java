package com.day07;

import java.util.Scanner;

public class PrimeNumberSum1to20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int j;
		for(int i=1;i<=20;i++) {
			for( j=2;j<=i;j++) {
				if(i%j==0) {
					break;
		
				}
			}
			if(i==j) {
				sum =sum+j;
				
			}
		}
		
		System.out.println(sum);
		
			
	}
}
	


