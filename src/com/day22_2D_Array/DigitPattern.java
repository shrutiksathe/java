package com.day22_2D_Array;

public class DigitPattern {
	public static void p1(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==0 || j==0 || j==a.length-1 || i==a.length-1) {
					System.out.print(a[i][j]);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3,4},{4,5,6,7},{8,9,1,2},{6,7,5,4}};
      DigitPattern.p1(a);
	}

}
