package com.day20_Array;
import java.util.Scanner;
public class AlternateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of Array:-");
		int size=sc.nextInt();
		int arr[]=new int[size];
		//Accept array from user
		System.out.println("Enter your array elemnet:-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//print array alternate way
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}

	}

}
