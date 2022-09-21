package com.day17_Inheritance;
class Truck{
	String Brand;
}
class Alto extends Truck{
      	String type;
}
class Model extends Alto{
	
	 void show() {
		 Brand="Maruti";
		 type="petrol";
		 System.out.println(Brand+"  "+type);
	 }
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Model m=new Model();
          m.show();
      }
}
