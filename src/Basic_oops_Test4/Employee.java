package Basic_oops_Test4;

import java.util.Scanner;

/*1.	Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".*/


public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter Your Gender:");
		char gender=sc.next().charAt(0);
		System.out.println("Enter your Marital Status:");
		char status=sc.next().charAt(0);
		if(gender=='f') {
			System.out.println("Work only in urban Area");
		}
		else if((gender=='m') && (age>20 && age<40)) {
			System.out.println("Work anywhere");
			}
		else if((gender=='m')&&(age>40 && age>60)) {
			System.out.println("Work urban area ");
		}
		else {
			System.out.println("Error");
		}

	}

}
