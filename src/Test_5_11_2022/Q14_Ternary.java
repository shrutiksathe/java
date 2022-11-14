package Test_5_11_2022;

import java.util.Scanner;

//14.	Convert following conditions into ternary statement 
//If ( score < 40000 )
//  If ( score < 25000 )
//then sysout ( “ bronze “ ) ; 
//     else 
//    	 sysout(“silver” );
//else if ( score < 60000) 
 // sysout( “ gold”);
//else
//sysout(“platinum” );

public class Q14_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int score=sc.nextInt();
		String result= (score<40000)? ((score<25000)? "Bronze":"silver") :(score<60000)?"gold":"paltinum";
        System.out.println(result);
	}

}
