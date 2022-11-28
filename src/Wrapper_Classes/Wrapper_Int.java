package Wrapper_Classes;

public class Wrapper_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		
		Integer myint=new Integer(i); //boxing
		
		Integer myint2=i;         //autoboxing
		
		int x=myint.intValue(); //unboxing
		
		int x2=myint2; //autoboxing
		

	}

}
