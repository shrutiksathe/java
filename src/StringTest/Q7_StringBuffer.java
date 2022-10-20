package StringTest;

public class Q7_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj=new StringBuffer("Good ");
		System.out.println(obj);
		
		obj.append("Morning"); // join goodmorning
		System.out.println("append:- "+obj);
		
		obj.insert(0, "hi "); // At 0 position insert hi 
		System.out.println("insert:- " +obj);
		
		obj.replace(2, 7, "__"); // replace in midal of 2to7 replace with __.
		System.out.println("Replace:- "+obj);
		
		obj.delete(2,5);
		System.out.println("delete:- "+obj);
		
		obj.reverse();
		System.out.println("Reverse:- "+obj);
		
		
		

	}

}
