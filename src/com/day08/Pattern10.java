package com.day08;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print("o");
				}
				else {
					System.out.print("1");
				}
			}System.out.println();
		}

	}

}
