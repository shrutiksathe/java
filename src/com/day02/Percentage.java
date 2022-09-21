// write a code to find out the percentage for 5 subject marks
package com.day02;

public class Percentage {
	public static void main(String[] args) {
		int s1,s2,s3,s4,s5;
		float sum, percentage;
		s1=80;
		s2=79;
		s3=89;
		s4=83;
		s5=76;
		sum=s1+s2+s3+s4+s5;
		percentage=(sum/500)*100;
		System.out.println("The percentage of 5 subject is : "+percentage);
		
	}

}
