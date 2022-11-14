package Method;
class Animal{
	static void m1() {
		System.out.println("m1");
	}
}
class Dog extends Animal{
	 static void m1() {
		System.out.println("Dog");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.m1();

	}

}
