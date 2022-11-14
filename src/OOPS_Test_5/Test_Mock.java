package OOPS_Test_5;
import java.util.Scanner;
public class Test_Mock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		while(n>0) {
			  int r=n%10;
			   sum=sum+r;
			   n=n/10;
			   count++;
		}
//		System.out.println(sum);
//		System.out.println(count);
		int result=sum/count;
		System.out.println("Avg is :- "+result);
        
	}

}
