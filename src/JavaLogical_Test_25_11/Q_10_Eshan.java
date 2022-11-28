package JavaLogical_Test_25_11;

public class Q_10_Eshan {
	public static void StringPattern(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		
		for(int i=s.length()-2;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ESHAN";
		StringPattern(s);

	}

}
