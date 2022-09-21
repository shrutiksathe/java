package com.day06;

public class Display1To30Divisible239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=30;i++) {
			if(i%2==0 && i%3==0 && i%9==0) {
				continue;
			}
			System.out.println(i);
		}
		

	}

}
//o/p= all number print 1to 30 and skipped 18
