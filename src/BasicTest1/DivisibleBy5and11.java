package BasicTest1;

import java.util.Scanner;

public class DivisibleBy5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      
      if(num%5==0 && num%11==0){
    	  System.out.println("Divisible by 5 and 11");
      }
      else {
    	  System.out.println("not Divisible by 5 and 11");
      }
	}

}
