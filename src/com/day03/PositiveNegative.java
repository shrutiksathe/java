package com.day03;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.print(" Enter the number : ");
         Scanner sc=new Scanner(System.in);
         int n =sc.nextInt();
         
         if(n>0) {
        	 System.out.println("Positive number");
         }
         else if(n<0) {
        	 System.out.println("Negative number");
        	 }
         else if(n==0) {
        	 System.out.println("Zero");
         }
	}

}
