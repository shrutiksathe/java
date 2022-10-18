package com.day24_String;

import java.util.Scanner;

public class ReduceName {
	public static void reduce(String str) {
		String s[]=str.split("\\s");
		String rname=" ";
		for(int i=0;i<s.length-1;i++) {
			 rname=rname+s[i].charAt(0)+" ";
		}
		rname=rname+s[s.length-1];
		System.out.println(rname);
}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Name: ");
         String nm=sc.nextLine();
         ReduceName.reduce(nm);
	}

}
