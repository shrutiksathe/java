package com.day23_String;
import java.util.Scanner;
public class String_Num {
	public static void stringNum(String s) {
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			if(c[i]>'0' && c[i]<'9') {
				 if(c[i]%2==0) {
					 System.out.println(+c[i]);
				 }
			}
		}
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("ENter String:-");
      String s=sc.next();
      String_Num.stringNum(s);
      
      
	}

}
