package JavaLogical_Test_25_11;

public class Q4_DigiSum_String {
	public static void numberSum(String s) {
		int sum=0;
		String st[]=s.split("\\D");
		 
		 for(int i=0;i<st.length;i++) {
			 if(!st[i].trim().equals("")) {
				 int x=Integer.parseInt(st[i]);
				 sum=sum+x;
			 }
		 }
		 System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="myname25is4rishi450";
		numberSum(str);

	}

}
