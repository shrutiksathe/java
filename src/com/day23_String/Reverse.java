package com.day23_String;
//reverse string by using array reverse
import java.util.Scanner;

public class Reverse {
     public static String rev(String str) {
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
    	 return s1;
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:-");
		String ch=sc.next();
		System.out.println(Reverse.rev(ch));
		
		

	}

}
