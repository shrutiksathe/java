package OOPS_Test_5;
//Print the pattern 
//      1 
//    1 2 3
//  1 2 3 4 5
//1 2 3 4 5 6 7


public class Q7_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            for(int i=1;i<=7;i+=2) {
            	for(int j=1;j<=i;j++) {
            		System.out.print(" " +j);
            	}
            	System.out.print(" \n");
            }
	}

}
