package Method;

public class Factorial {
	public void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Your factorial of "+n+ " is "+fact);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Factorial obj=new Factorial();
          obj.fact(5);
	}

}
