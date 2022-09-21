import java.util.Scanner;

public class Power3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int num=sc.nextInt();
		 boolean is_PowerOfThree=true;
		 if(num<=0) {
			 is_PowerOfThree=false;
		 }
		 while(num%3==0) {
			 num=num/3;
		 }
		 if(num==1) {
			 System.out.println(is_PowerOfThree=true);
		 }
		 else {
			 System.out.println(is_PowerOfThree=false);
		 }
		
		

	}

}
