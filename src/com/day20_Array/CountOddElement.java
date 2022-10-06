package com.day20_Array;

import java.util.Scanner;

public class CountOddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the Array Elemnt:-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		} 
		System.out.println("Odd count is:- "+count);
		

	}

}
