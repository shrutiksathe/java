package com.day03;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.print(" Enter the Number : ");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if(n%2==0) {
          System.out.println("The Number is Even");
         }
         else
         {
        	 System.out.println("the number is odd");
         }
	}

}
