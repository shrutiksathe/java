package com.day23_String;

import java.util.Scanner;

public class AvgDigit {
        public static void Avg(String str) {
        	int sum=0,count=0;
        	   for(int i=0;i<str.length();i++) {
        		   char ch=str.charAt(i);
        		   if(ch>='0' && ch<='9') {
        			   count++;
        			   int x=Character.getNumericValue(ch);
        			   sum=sum+x;
        		   }
        	   }
        	  int avg=sum/count;
        	  System.out.println("Avg is: "+avg);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String st=sc.next();
		AvgDigit.Avg(st);

	}

}
