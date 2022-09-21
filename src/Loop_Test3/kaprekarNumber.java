package Loop_Test3;

import java.util.Scanner;

public class kaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int t=num;
		int p=1;
		int sqr=num*num;
		while(t>0) {
			p=p*10;
			t=t/10;
			
		}
		int a=sqr/p;
		int b=sqr%p;
		int result=a+b;
		if(result==num) {
			System.out.println("Kaprekar Number");
		}
		else {
			System.out.println("Not Kaprekar NUmber");
		}
		

	}

}
