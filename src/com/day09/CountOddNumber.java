package com.day09;

public class CountOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for (int i = 25; i >= 10; i--) {
			if (i % 2 != 0) {
				count++;

			}
		}
		System.out.println(count);

	}

}
