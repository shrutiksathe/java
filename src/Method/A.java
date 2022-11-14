package Method;
class x{
	 void m1() {
		System.out.println("parent m1");
	}
}
class y extends x{
	 void m2() {
		
		System.out.println("child m1");
	}
}
public class A {
//	private void m1() {
//		System.out.println("parent m1");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         y o=new y();
         o.m2();
//         A oj=new A();
//         oj.m1();
	}

}
