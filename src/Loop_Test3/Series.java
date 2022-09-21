//0,3,8,15,24,35,48,...
package Loop_Test3;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,r;
		//System.out.print("0,");
		do {
			//i=i+0;
			r=i*i-1;
			System.out.print(r+",");
			i++;
			
		}while(i<=10);

	}

}
