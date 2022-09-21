package com.day06;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number: ");
       int num=sc.nextInt();
       int sum=num+num;
       int mul=num*num;
       if(sum==mul) {
    	   System.out.println("Spy number");
       }
       else {
    	   System.out.println("Not spy number");
       }
	}

}
