package JavaLogical_Test_25_11;

public class Q8_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, row = 5;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}  
//		 int i=0,j=0,row=6;
//		for( (i=0,j=row-i,j=0);i<row,j>1,j<=i;i++,j--,j++) {
//			System.out.print(" ");
//			System.out.print("*");
//			System.out.println();
//		}
		
		}   
		
	}


