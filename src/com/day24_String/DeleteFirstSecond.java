package com.day24_String;

public class DeleteFirstSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="goodmorning";
		String s2="good";
		
		
		 char ch1[]=s1.toCharArray();
		 char ch2[]=s2.toCharArray();
		
		 int i,j;
		for( i=0;i<ch1.length;i++) {
			 boolean visited=false;
			 
			  for( j=0;j<ch2.length;j++) 
			    {
				  if(ch1[i]==ch2[j]) {
					  visited=true;
					break;
			       }
			    }
			  
			  if(visited==false) {
			   System.out.print(ch1[i]);
			  }
		}
		

	}

}
