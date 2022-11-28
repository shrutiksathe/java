package JavaLogical_Test_25_11;

import java.util.Arrays;
import java.util.Scanner;
public class Q6_Anagram {
	// army and mary
	
	 public static void anagramCheck(String s1,String s2) {
		 String ss1=s1.toLowerCase();
		 String ss2=s2.toLowerCase();
		 
		 char ch1[]=ss1.toCharArray();
		 char ch2[]=ss2.toCharArray();
		  
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
//		 System.out.println(ch1);
//		 System.out.println(ch2);
//		 if(Arrays.equals(ch1, ch2)) {
//			 System.out.println("Anagram");
//		 }else {
//			 System.out.println("No anagram");
//		 }
		 String sn1="";
		 String sn2="";
		 for(int i=0;i<ch1.length;i++) {
		   sn1=Character.toString(ch1[i]);
		 }
		 for(int j=0;j<ch2.length;j++) {
			 sn2=Character.toString(ch2[j]);
		 }
		 if(sn1.equals(sn2)) {
			 System.out.println("Anagram");
		 }else {
			 System.out.println("Not Anagram");
		 }
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String:-");
		String s1=sc.next();
		System.out.println("Enter second String:- ");
		String s2=sc.next();
		
		anagramCheck(s1,s2);
		

	}

}
