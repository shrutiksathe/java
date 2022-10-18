package StringTest;
import java.util.Scanner;
//Reverse middle words of a string
//Given a string str, print reverse all words except the first and last words.
//
//Examples:
//Input: Hi how are you students
//Output: Hi woh era uoy students
//Input: I am fine
//Output: I ma fine

public class Q4ReverseMiddleWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter String:-");
		 String str=sc.nextLine();
		 String reverse=" ";
		 String s[]=str.split("\\s");
		 
		 //first word print

		 System.out.print(s[0]);
		 
		 //main string loop middle word 
		 for(int i=1;i<s.length-1;i++) {
			 String word=s[i];
			 String rev="";
			
			 //for word
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			 reverse=reverse+rev;
			 
		 }
		 System.out.print(reverse);
		 
		 System.out.print(" "+s[s.length-1]);
	}

	

}
