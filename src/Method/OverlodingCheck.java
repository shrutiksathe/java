package Method;
class fruit {
	 void m1() {
		System.out.println("Zero argu method");
	}
	 void m1(char c) {
		System.out.println("one argu method");
	}
	
}

public class OverlodingCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 fruit obj=new fruit();
                 obj.m1();
                 obj.m1('s');
	}

}
