package Method;
class Parent{
	void m1() {
		System.out.println("Hello");
	}
	void m2(int a) {
		System.out.println("M2 method");
	}
	void m3(char c) {
		System.out.println("m3");
	}
}
class child extends Parent{
	void m2() {
		super.m1();
		super.m2(8);
		super.m3('g');
	}
}
public class MethodSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.m2();

	}

}
