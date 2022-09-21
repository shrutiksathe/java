//Q 1 Write a program to print all numbers between 1 and 100 except the number which are divisible by 5 or 10.
package Loop_Test2;

public class Divisible_by5or10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%5==0 || i%10==0) {
				
			}
			else {
				System.out.println(i);
			}
		}

	}

}
