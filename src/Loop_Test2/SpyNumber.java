package Loop_Test2;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Number:");
		int num=sc.nextInt();
		int sum=0;
		int mul=1;
		while(num>0) {
			int no=num%10;
			 sum=(no+sum);
			 mul=(no*mul);
			num=num/10;
		}
		if(sum==mul) {
			System.out.println("spy");
		}else {
			System.out.println("Not spy");
		}

	}

}
