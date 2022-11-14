package String_Assignment;

import java.util.Scanner;

//12.	Write a Java program to count occurrences of a character in given string.
public class Q12_CountChar {
	 public static void charcount(String str,char ch) {
		 char c[]=str.toCharArray();
		 int count=0;
		
		 for(int i=0;i<c.length;i++) {
			if(ch==c[i]) {
				count++;
			}
		 }
		 System.out.println("Count of "+ch+" is : "+count);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:-");
		String str=sc.nextLine();
		System.out.println("Enter the character:-");
		char ch=sc.next().charAt(0);
		Q12_CountChar.charcount(str, ch);

	}

}
