package OOPS_Test_5;

public class Q6_Output {
	int x = 10;

	public void assign(int x) {
		 x = x;
		// System.out.println(x); //this is methods x
		System.out.println(this.x);   // we used heare this function, this call current obj of class 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q6_Output().assign(100);


	}

}
