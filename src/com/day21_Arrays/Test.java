package com.day21_Arrays;

import java.util.Scanner;

// int array display alternate element from array
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element:-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i=i+2) {

				System.out.println(arr[i]);
			}
		
		}
	}
