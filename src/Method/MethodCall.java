package Method;

public class MethodCall {
	
	void m1() {
		System.out.println("M1");
		m2(); // m2 method call from m1 method
	}
	void m2() {
		System.out.println("M2");
		m3();// m3 method call from m2 method
	}
	void m3() {
		System.out.println("M3");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCall c=new MethodCall();
		c.m1();     // from main method call only m1 method...

	}

}

