package OOPS_Test_5;
//What will be Output?
class Animal{
	String name="Animal";
	String makeNoise() {
		return "generic_Noise";
	}
}
class Dog extends Animal{
	String name;                // becz here not initialize value so jvm provide by default values
	String show() {
		return name;
	}
}


public class Q9_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a=new Dog();
		System.out.println(a.show());        
      }

}
//o/p=> null
