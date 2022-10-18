package com.day23_String;

import java.util.Scanner;

public class String_Digit_Sum {
	public static void digitSum(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);         
			if(ch>='0' && ch<='9') {
				System.out.println(ch);
				int x=Character.getNumericValue(ch); // convert char to int
				 sum=sum+x;
			}
		}
		System.out.println("Sum of Digit is:-"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String_Digit_Sum.digitSum(str);
      
	}

}
