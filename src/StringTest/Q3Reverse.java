package StringTest;
//Write a Program to reverse a given string in place? (that means without using second
//string)

import java.util.Scanner;

public class Q3Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter String:-");
		String str=sc.next();
		
		for(int i=str.length()-1;i>0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
