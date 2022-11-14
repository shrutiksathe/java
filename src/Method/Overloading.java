package Method;


public class Overloading {
	public static float add(int a ,float b) {
		float sum=a+b;
		return sum;
	}
	private static int add(int a,int b,int c) {
		int sum=a+b+c;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Overloading.add(5, 5));
		System.out.println(Overloading.add(5, 5,5));

	}

}
