package String_Assignment;

import java.util.Arrays;

//10.	WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class Q9_Split {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HELLO$WORD";
        String []str=s.split("\\$");
        System.out.println(Arrays.toString(str));


	}

}
