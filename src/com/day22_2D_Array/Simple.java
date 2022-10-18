package com.day22_2D_Array;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][]= {{1,4,6},
//				      {7,3,2},
//				      {9,4,1}};
		
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][2];
		System.out.println("ENter array element row wise:-");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		//disply simple loop
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		}

	}

}
