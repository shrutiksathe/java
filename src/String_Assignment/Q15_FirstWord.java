package String_Assignment;
//15.	Write a Java program to find first occurrence of a word in a given string.
import java.util.Scanner;
public class Q15_FirstWord {
	public static void first(String s ) {
		String st[]=s.split(s);
		String ss=st[0];
		 System.out.println(ss);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:- ");
		String s=sc.nextLine();
		Q15_FirstWord.first(s);
        
	}

}
