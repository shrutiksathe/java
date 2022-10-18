package StringTest;
import java.util.Arrays;
//5.	How to sort String on their length.
//E.g. I Love UK Country
//Output -Country Love UK I
import java.util.Scanner;
public class Q5StringSortWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:- ");
		String str=sc.nextLine();
		
		String large;
		String currentword;
		
		String s[]=str.split("\\s");
		large=s[0];
		
		
		for(int i=0;i<s.length;i++) {
			currentword=s[i];
			if(currentword.length()>large.length()) {
				large=currentword;
				
			}
		}
		System.out.println("Large Word is:- "+large);
		//
		System.out.println(Arrays.toString(s));
		
		

	}

}
