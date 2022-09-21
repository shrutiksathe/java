package BasicTest1;

import java.util.Scanner;

public class AlphabetDigitCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character: ");
		char ch=sc.next().charAt(0);
		System.out.println(ch>='a' && ch<='z' ? "Alphabet" :ch>='0' && ch<='g' ? "Digit" : " symbol");

	}

}
