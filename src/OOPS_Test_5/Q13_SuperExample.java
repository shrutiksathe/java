package OOPS_Test_5;
class parent{
	int x=10;
}
class child extends parent{
	int x=100;
	void m1() {
	  System.out.println(super.x); // refers the parent class object
	}
}

public class Q13_SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           child c=new child();
           c.m1();
	}

}
