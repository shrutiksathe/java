package BasicTest1;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter first number: ");
		int a=sc.nextInt();
		System.out.println("ENter second number: ");
		int b=sc.nextInt();
		System.out.println("1.Addition , 2.Substraction , 3.Multiplication , 4.Division");
		System.out.println("Enter your Choice: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("addition:"+(a+b));
		break;
		case 2:System.out.println("substraction:"+(a-b));
		break;
		case 3:System.out.println("Multiplication:"+(a*b));
		break;
		case 4:System.out.println("Division:"+(a/b));
		break;
		default:System.out.println("enter a valid case");
		}

	}

}
