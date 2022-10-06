package ArrayTest_1D;

public class Q2_Output {
	static int mcCartyCounter=100;
	public static int mcCarthy(int n) {
		mcCartyCounter++;
		if(n>100)
			return n-10;
		else
			return mcCarthy(n+11);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(mcCarthy(100)+" "+mcCartyCounter);

	}

}
// output:- 101 102
