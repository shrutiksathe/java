package com.day.Interface;

interface drawable{
	 void draw();
}
interface writeable{
	void write();
	
}
class A implements drawable,writeable{
	public void draw() {
		System.out.println("Draw");
	}
	public void write() {
		System.out.println("write");
	}
}


public class MutltipleInheritanceByInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A obj=new A();
        obj.draw();
        obj.write();
	}

}
