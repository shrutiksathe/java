package com.day20_Array;

public class Chararr_to_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		char ch[]=new char[] {'a','b'};
//		
//	    String s="";
//	    
//	    for(int i=0;i<ch.length;i++) {
//	    	s=s+ch[i];
//	    }
//	    System.out.println(s);
		
		
		String ck="4dro6";
		String checkstring="";
		 for(int i=1;i<ck.length();i++) {
			 System.out.println(ck.charAt(i));
			 checkstring=checkstring+Character.toString(ck.charAt(i));
		 }
		 
		 System.out.println(checkstring);
	}

}
