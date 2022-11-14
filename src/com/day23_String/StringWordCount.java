package com.day23_String;

import java.util.Scanner;

public class StringWordCount {
	
	public static void count(String s) {
		
		String []st=s.split("\\s");
//		int c=st.length;             // first way
//		System.out.println(c);
		
		int count=0;                //second way
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
			count++;
		}
		System.out.println("Count is:-"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:-");
		String s=sc.nextLine();
		
		count(s);
		
	}

}
