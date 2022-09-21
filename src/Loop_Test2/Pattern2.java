package Loop_Test2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int k=5;k>=i;k--) {
				System.out.println(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.println(j);
			}
			System.out.println(" \n");
		}

	}

}
