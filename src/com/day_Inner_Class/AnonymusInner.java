package com.day_Inner_Class;
abstract class Myclass{
	abstract void run();
}

public class AnonymusInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Myclass c=new Myclass()
        		  {
        	        void run() {
        	        	System.out.println("Class Runnning... ");
        	        }
        		  };
        		  c.run();
	}

}
