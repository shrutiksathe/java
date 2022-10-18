package com.day23_String;
// Count the total char from String
import java.util.Scanner;

public class Char_Count {
	public static void Count(String str) {
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' ) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 String str=sc.next();
		 Char_Count.Count(str);
		 
		

	}

}
