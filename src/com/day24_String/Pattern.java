package com.day24_String;
//i love my india
//o/p->
//i 
//i love 
//i love my 
//i love my india 
import java.util.Scanner;

public class Pattern {
	public static void patterns(String str) {
		String s1[]=str.split(" ");
		// System.out.println(s1[1]); //to print 2 index word to check split or not
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(s1[j]+ "");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string Line:-");
		String str=sc.nextLine();
		Pattern.patterns(str);

	}

}
