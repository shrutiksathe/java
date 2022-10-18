package com.day24_String;
//helloo how r u
// o/p ->HELLOO HOW R U

import java.util.Scanner;

public class TongalCase {
	public static void convert_string(String str) {
		String word=" ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') { 
				word=word+(char)(str.charAt(i)-32);
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				word=word+(char)(str.charAt(i)+32);
			}
			else {
				word=word+str.charAt(i);
			}
		}
		System.out.println(word);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		TongalCase.convert_string(s1);

	}

}
