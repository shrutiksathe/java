package Basic_oops_Test4;
import java.util.Scanner;
/*A salesman is a given commission on the basis of sales he makes he gets a commission of 5% only 
if sales made by him is above 2000 .
write a program to accept sales ammount and calculate commission he gets*/
public class SalesmanCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int amount=sc.nextInt();
		int commi=0;
		if(amount>2000) {
			commi=amount*5/100;
			System.out.println("Your Commission:"+commi);
		}
		else {
			System.out.println("No Commission");
		}

	}

}
