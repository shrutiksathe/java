package com.day24_String;

import java.util.Scanner;

public class StringSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
      
		 int l=s.length();
		 int sum=0;
		 for(int i=0;i<l;i++) {
			 if(Character.isDigit(s.charAt(i))) {
				 String str=s.substring(i,i+1);
				 sum=sum+Integer.parseInt(str);
			 }
		 }
		 System.out.println(sum);
		
	}

}
