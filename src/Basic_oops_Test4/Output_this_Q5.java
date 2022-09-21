package Basic_oops_Test4;
class overload{
	static int x=2;
	int y;
	void add(int a ) {
		x=a+1;
	}
	void add(int a,int b) {
		add(a);
		x+=a+2;
	}
}

public class Output_this_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 overload obj=new overload();
		 int a=0;
		 obj.add(6,7);
		 System.out.println(obj.x);

	}

}
