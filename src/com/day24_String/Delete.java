package com.day24_String;

import java.util.Scanner;

public class Delete {
     public static void m1(String s1,String s2)    {
    	 char ch1[]=s1.toCharArray();
    	 char ch2[]=s2.toCharArray();
    	
    	for(int i=0;i<ch1.length;i++) {
    		 int count=0;
    	       for(int j=0;j<ch2.length;j++) 
    	       {
    	    	   if(ch1[i]==ch2[j]) 
    	    	   {
    	    		   count++;
//    	    		   System.out.println(ch1[i]);
    	    		   break;
    	    	   }
    	      }
    	       if(count==0) {
    	    	   System.out.print(ch1[i]);
    	       }
    	}
   }
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First String:- ");
		String s1=sc.next();
		System.out.println("Enter Your Second String:- ");
		String s2=sc.next();
		Delete.m1(s1, s2);
	}
}
