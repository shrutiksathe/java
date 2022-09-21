package com.day03;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charcter: ");
		char ch=sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
			System.out.println(ch+" is a vowels");
		}
		else {
			System.out.println(ch+" is a consonants");
		}
		
		

	}

}
