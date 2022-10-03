package OOPS_Test_5;

public class Q13_ThisExample {
	int a=10,b=20;
	void m1(int a ,int b) {
		System.out.println("method referne:-"+a+b);// this variavle initialize through method call
		System.out.println("Instance:-"+(this.a+this.b));// this intialize instance variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q13_ThisExample t=new Q13_ThisExample();
		t.m1(4, 4);
     }

}
