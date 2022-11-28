package Wrapper_Classes;

public class Wrapper_Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 float i=2.5f;
		 
		 Float myfloat=new Float(i); //boxing
		 
		 Float myfloat2=i;      //autoboxing
		 
		 Float x=myfloat.floatValue(); //unboxing
		 
		 Float x2=myfloat2;  //autoboxing
	}

}
