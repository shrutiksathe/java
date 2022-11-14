package Test_5_11_2022;
//Write a program to find if given String is palindrome or not.
//e.g. ‘nitin’ is palindrome. If reverse of a string is same as original string,
//it is called palindrome. 

import java.util.Scanner;

public class Q16_StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String:- ");
		String s1=sc.nextLine();

		char ch[] =s1.toCharArray();
		String rev="";
		int j=ch.length-1;
		for(int i=0;i<ch.length/2;i++) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			j--;
			
		}
		
		rev=new String(ch);
		
		if(rev.equals(s1)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}

	}

}
