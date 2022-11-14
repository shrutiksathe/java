package String_Assignment;

import java.util.Scanner;

public class Q11_CountWord {
	public static void count(String s) {
		String [] str=s.split("\\s");
		 
		 System.out.println(str.length);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:-");
		String str=sc.nextLine();
          Q11_CountWord.count(str);
	}

}
