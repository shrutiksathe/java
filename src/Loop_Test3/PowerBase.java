package Loop_Test3;

import java.util.Scanner;

public class PowerBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base:");
		int base=sc.nextInt();
		System.out.println("Enter Index:");
		int index=sc.nextInt();
		int result=1;
		for(int i=1;i<=index;i++) {
			result=base*result;
		}
		System.out.println(result);
		

	}

}
