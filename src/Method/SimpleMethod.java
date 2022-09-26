package Method;

public class SimpleMethod {
	
	public int Display(int a ,int b) {
		System.out.println("Hii");
		int c=a+b;
		return c;
		 
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SimpleMethod s=new SimpleMethod();
         int result= s.Display(2, 2);
         System.out.println(result);
           
          
	}

}
