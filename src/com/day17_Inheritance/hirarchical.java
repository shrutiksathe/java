package com.day17_Inheritance;
class Fruits{
	 String s="Fruits";
}
class Apples extends Fruits{
	void show() {
		System.out.println(" Apple is a "+s);
	}
}
class Mango extends Fruits{
	void shows() {
		System.out.println(" Mango is a "+s);
	}
}
class Chikku extends Fruits{
	void showed() {
		System.out.println("Chikku is a "+s);
	}
	
}
public class hirarchical {
  public static void main(String[] args) {
	  Chikku c=new Chikku();
	  c.showed();
	  Mango m=new Mango();
	  m.shows();
	  }
  }

