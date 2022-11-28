package Task;
import java.util.Scanner;
class NumberException extends Throwable{
	NumberException(String s){
	  super(s);
	}
}
public class Throws {
	
	 public static void m1(int n)throws NumberException {
		   if(n>20) {
			   System.out.println("Number is big");
		   }else {
			   throw new NumberException("NUmber is lower");
		   }
	    }
	 

	public static void main(String[] args) throws NumberException  {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 try {
		   Throws.m1(n);
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 

	}

}
