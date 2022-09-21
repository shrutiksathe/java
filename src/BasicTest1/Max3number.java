package BasicTest1;

import java.util.Scanner;

public class Max3number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number: ");
     int a =sc.nextInt();
     System.out.println("Enter second number: ");
     int b=sc.nextInt();
     System.out.println("Enter third number: ");
     int c=sc.nextInt();
     if(a>b && a>c) {
    	 System.out.println("max number is: "+a);
     }
     else if(b>c) {
    	 System.out.println("max number is: "+b);
     }
     else {
    	 System.out.println("max number is: "+c);
     }
	}

}
