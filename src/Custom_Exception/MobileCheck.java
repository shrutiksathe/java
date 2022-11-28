package Custom_Exception;
import java.util.Scanner;


class MobileException extends Throwable {
	MobileException(String s) {
		super(s);
	}
}



public class MobileCheck {
	public static void checkMobile(long m) throws MobileException{
		 int count=0;
		while(m>0) {
			long r=m%10;
			count++;
			 m=m/10;
		}
		if(count==10) {
			System.out.println("number is 10 digit");
		}else {
			throw new MobileException("number is not 10 Exception");
		}
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number:- ");
		long m=sc.nextLong();
		try {
		MobileCheck.checkMobile(m);
		}catch (MobileException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
