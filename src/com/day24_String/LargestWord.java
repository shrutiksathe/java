package com.day24_String;

import java.util.Arrays;
import java.util.Scanner;

public class LargestWord {
        public static void wordLargest(String st) {
        	String s[]=st.split("\\s");
        	//int c[]=new int[s.length]; // word length array
        	
        //	String largeWord[]=new String[s.length];
        	//for String
        
        	for( int i=0;i<s.length;i++) {
        		//for word
        		
        		   int count=0;
        		   
        		  for(int j=0;j<s.length;j++) {
        		    String word=s[i];
        		     count=s[i].length();
        		     
        		     //c[i]=s[i].length();
        		   }
        		 System.out.println(s[i]+" "+count);
        		 
        		
        	}
//        	for(int k=0;k<c.length;k++) {
//  			  System.out.println(c[k]+" "+s[i]);
//  		  }
        	
        }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		LargestWord.wordLargest(str);

	}

}
