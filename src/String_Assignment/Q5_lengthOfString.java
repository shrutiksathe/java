package String_Assignment;
import java.util.Scanner;
public class Q5_lengthOfString {
	public static void length(String str) {
		System.out.println(str.length());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:- ");
		String s=sc.nextLine();
		length(s);

	}

}
