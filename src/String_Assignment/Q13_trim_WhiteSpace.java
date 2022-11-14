package String_Assignment;
//13.	Write a Java program to trim leading white space characters in a string.
public class Q13_trim_WhiteSpace {
	public static void trim(String st) {
		
		System.out.println(st.trim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st=   "  Hi how are you  ";
		Q13_trim_WhiteSpace.trim(st);

	}

}
