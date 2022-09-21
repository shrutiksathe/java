package Loop_Test3;

import java.util.Scanner;

//WAP to accept mobile number and count a Frequency of Digit
public class MobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile no:-");
		int num=sc.nextInt();
		System.out.println("Enter Digit");
		int digit=sc.nextInt();
		while(num!=0) {
			int rem=num%10;
			  if(rem==digit) {
				  count++;
				  }
			  num=num/10;
		}
		if(count==0) {
			System.out.println("No frequency");
		}
		else {
			System.out.println("Frequency is:"+count);
		}

	}

}
