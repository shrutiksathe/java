package com.day23_String;
//i love my bike
//o/p-> i evol ym ekib

import java.util.Scanner;

public class EverySingleWordReverse { 
	public static String reverseWord(String str ) {
		String reverse=" ";
		String s[]=str.split( " ");     //   word seperate by using space
		
		for(int i=0;i<s.length;i++) {   // for full senetense
			String word=s[i];
			String rev=" ";
			   for(int j=word.length()-1;j>=0;j--) { // for word
				  rev=rev+word.charAt(j);
			   }
			   reverse=reverse+rev;
		}
		
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Line:-");
		String st=sc.nextLine();
		System.out.println(EverySingleWordReverse.reverseWord(st));
	

	}

}
