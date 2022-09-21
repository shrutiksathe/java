package com.day17_Inheritance;
  class Mobile{
	  String m="Mobile";
  }
  class Micromax extends Mobile{
	  void display() {
		  System.out.println("Apple is a "+m);
	  }
  }
  class Samsung extends Mobile{
	  void show() {
		  System.out.println("Samsung is a "+m);
	  }
  }
public class Hirarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Samsung s=new Samsung();
         s.show();
         Micromax m=new Micromax();
         m.display();
	}

}
