package com.day22_2D_Array;

import java.util.Scanner;

public class Simple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[][]=new int[3][3];
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Array Elmt:-");
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr[i].length;j++) {
				  arr[i][j]=sc.nextInt();
			  }
		  }
		  //Display
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr[i].length;j++) {
				  System.out.print(arr[i][j]+" ");
			  }
			  System.out.println();
		  }

	}

}
