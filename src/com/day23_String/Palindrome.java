package com.day23_String;

import java.util.Scanner;

public class Palindrome {
	public static void palin(String str) {
		String s1=" ";
		char ch[]=str.toCharArray();
		int j=ch.length-1;
		for(int i=0;i<ch.length/2;i++) {
			 char temp=ch[i];
			 ch[i]=ch[j];
			 ch[j]=temp;
			 j--;
		}
		s1=new String(ch);
		if(s1.equals(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter STring:-");
		String str=sc.next();
         Palindrome.palin(str);
	}

}
