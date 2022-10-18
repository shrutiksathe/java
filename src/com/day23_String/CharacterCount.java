package com.day23_String;

import java.util.Scanner;

public class CharacterCount {
	public static int charcount(String str) {
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
		}
		//System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		System.out.println(CharacterCount.charcount(s1));

	}

}
