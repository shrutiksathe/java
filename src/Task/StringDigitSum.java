package Task;
import java.util.Arrays;  //abc23bcd2
import java.util.Scanner;
public class StringDigitSum {
	  public static void checkDigit(String s) {
		  String str[]=s.split("\\D");
		  String snew=str.toString(); 
		  System.out.println(snew);
		
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		checkDigit(s);
		
	}
	}


