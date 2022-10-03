package com.day.Constructor;

public class Test {
	int idid;
	String nmnm;

	
	/**
	 * Test()                              // Non parametrise constructor
	 * { id=9; nm="Shrutik"; }
	 */
	 
	 Test(int id , String nm){           // this parametrise constructor.
		 this.idid=id;
		 this.nmnm=nm;
	 }
	
	 void display() {
		 System.out.println(idid);
		 System.out.println(nmnm);
 	 }
           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test(1,"Nikita"); //Default constructort
	
		t.display();

		
	}

}
