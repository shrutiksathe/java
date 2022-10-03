package com.day.Constructor;
class Tests{
	Tests(){
		this("Don");
		System.out.println("O arg Constructor");
	}
	Tests(String nm){
		
		System.out.println(nm);
		
	}
}

public class Const_Call {
	public static void main(String[] args) {
		//Tests t=new Tests();
		Tests t1=new Tests();
	}

}
