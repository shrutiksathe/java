package Test_5_11_2022;

class Base {
	 
int num ;
public void display() {
System.out.println(num);
}
public void setNum(int num) {
this.num = num;
}
}

class Derived extends Base {
int dNum ;
public void display() { 
	System.out.println(dNum);
}
}


public class Q2_Poly_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base Derived = new Derived();
		 Derived.setNum(10); 
		Derived.display();


	}

}
