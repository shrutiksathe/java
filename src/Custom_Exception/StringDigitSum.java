package Custom_Exception;
import java.util.Scanner;
class SumException extends Throwable{
	SumException(String s){
		super(s);
	}
}

public class StringDigitSum {
	public static void checkSum(String s)throws SumException{

		int s1=0;
		for(int i=0;i<s.length()/2;i++) {
			s1=s1+s.charAt(i);
			
		}
	
		int s2=0;
		for(int i=s.length()-1;i>=s.length()/2;i--) {
			s2=s2+s.charAt(i);
		}
		
		if(s1==s2) {
			System.out.println("Sum is same");
		}else {
		   throw new SumException("Sum is not same Exception");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		String s=sc.next();
		try {
		StringDigitSum.checkSum(s);
		}catch(SumException e) {
			System.out.println(e);
		}
	}

}
