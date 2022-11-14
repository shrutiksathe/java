package String_Assignment;
import java.util.Scanner;
public class Q8_UpperLower {
	
	public static void upper(String str) {
		 System.out.println("Upper Case:- "+str.toUpperCase());
	}
	public static void lower(String str) {
		System.out.println("Lower Case:- "+str.toLowerCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter String:- ");
		String s=sc.nextLine();
		Q8_UpperLower.upper(s);
		Q8_UpperLower.lower(s);

	}

}
