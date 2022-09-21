package com.day08;

import java.util.Scanner;

public class SingleDoubleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		
		if(n>=0 && n<=9 || n<=-0 && n>=-9) {
			System.out.println("Single");
		}
		else if(n>=10 && n<=99 || n<=-10 && n>=-99) {
			System.out.println("Double");
		}
		else if(n>=100 && n<=999 || n<=-100 && n>=-999) {
			System.out.println("triple");
		}
		else if(n>=1000 && n<=9999 || n<=-1000 && n>=-9999) {
			System.out.println("Fourble");
		}
		
		

	}

}
