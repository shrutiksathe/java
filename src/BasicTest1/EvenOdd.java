package BasicTest1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      if(num % 2==0) {
    	  System.out.println("Even number");
      }
      else {
    	  System.out.println("Odd number");
      }
	}

}
