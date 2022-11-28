package Custom_Exception;
import java.util.Scanner;
class ExpoException extends Throwable{
	ExpoException(String s){
		super(s);
	}
}
public class BaseExponentCheck  {
	
	public static void power(int base,int exponent)throws ExpoException {
		int power=1;
		if(exponent <= 0) {
			throw new ExpoException("Exponent is less than zero"); 
		}
		
		for(int i=1;i<=exponent;i++) {
			power=power*base;
		}
		System.out.println(power);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base:- ");
		int b=sc.nextInt();
		System.out.println("Enter Exponent:- ");
		int e=sc.nextInt();
		try {
		BaseExponentCheck.power(b, e);
		}catch(ExpoException m) {
			System.out.println(m);
		}
	}

}
