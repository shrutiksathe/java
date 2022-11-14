package com.day24_String;
import java.util.Arrays;
import java.util.Scanner;   //PASSword     4dro6
public class Password_check_Task {
	public static void check(String s[],String ck) {
		
		
	    int ul=Character.getNumericValue(ck.charAt(0));
		int sum=Character.getNumericValue(ck.charAt(ck.length()-1));
		
	
    	String checkstring="";

    	
    	checkstring=Character.toString(ck.charAt(3))+
    			    Character.toString(ck.charAt(2))+
    			    Character.toString(ck.charAt(1));
    	
    	
		 char cs[]=checkstring.toCharArray();

		// main for loop
		  for(int i=0;i<s.length;i++) {
			  char pass[]=s[i].toCharArray();
			   
			
			  // upper case check
			    int count=0;
			    for(int p=0;p<pass.length;p++) {
			    	if(pass[p]>='A' && pass[p]<='Z') {
			    	
			    		count++;
			    	
			    	 }
			     }
			  
			 // Digit sum
			    int digitsum=0;
			    for(int j=0;j<pass.length;j++) {
		    		  if(pass[j]>='1' && pass[j]<='9') {
		    			  digitsum=digitsum+Character.getNumericValue(pass[j]);
		    		  }
		    	  }
			    
			     int ct=0;
			    for(int k=0;k<pass.length;k++) {
			    	 for(int m=0;m<cs.length;m++) {
			    	 if(pass[k]==cs[m]) {
			    		 ct++;
			    	   }
			         }
			    }
			    
			    //upper case count
			    if(count==ul) {
			    	//digit sum check
			    	if(digitsum==sum) {
			    		  //lastword
			    	        if(ct==3) {
			    	        	System.out.println(s[i]);
			    	        }
			    	  }
			    }
			     
			  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 String s[]=new String[3];
		 System.out.println("Enter the 3 Password:-");
		 for(int i=0;i<s.length;i++) {
			 s[i]=sc.next();
		 }
		 System.out.println("Enter check String:-");
		 String ck=sc.next();
		 
		 
		 Password_check_Task.check(s, ck);
		 
         
	}

}



