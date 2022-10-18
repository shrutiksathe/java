package com.day23_String;

import java.util.Scanner;

public class StringReverse {
	public static String rev(String st) {
		String s1=" ";
		
		//method 1
//		for(int i=0;i<st.length();i++) {
//			s1=st.charAt(i)+s1;
//		}
		
		//method 2
//		for(int i=st.length()-1;i>=0;i--) {
//			s1=s1+st.charAt(i);
//		}
		
		
		// method 3 By using Array
		
		char ch[]=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			s1=s1+ch[i];
		}
		return s1;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter String:- ");
		 String str=sc.next();
		 System.out.println(StringReverse.rev(str));
	}

}
