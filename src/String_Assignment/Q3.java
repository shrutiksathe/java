package String_Assignment;
//3.Compare string using new operator when new is present see different reference is there.
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("abcd");
		String str=new String("abcd");
		System.out.println(s==str);
		System.out.println(s.equals(str));

	}

}
