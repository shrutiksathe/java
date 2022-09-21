package com.day06;

public class even1to20skipDivisibleby3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			if(i%2==0){
				if(i%3==0) {
					System.out.println(i);
					break;
				}
				
				
			}
		}

	}

}
