package BasicTest1;

public class OperatorMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=5,b=4,c=3;
      System.out.println(a++ + b * ++c);
      System.out.println("a="+a+"b="+b+"c="+c); //a=6 b=4 c=4
      
      System.out.println(b*5/a+b+++b);
      System.out.println("a="+a+"b="+b+"c="+c); //a=6 b=5 c=4
      
	}

}
