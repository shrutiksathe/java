package com.day23_String;
import java.util.Scanner;
public class WordCount {
	 public static void  word(String str) {
		 // store str string to array by spliting
		 String s[]=str.split("\\s"); // split String with space
		 int count=0;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			count++;
		}
		System.out.println("Number Of Word is: "+count);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter String: ");
		String st=sc.nextLine();
         WordCount.word(st);
	}

}
