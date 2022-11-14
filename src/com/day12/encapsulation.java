package com.day12;



public class encapsulation {
   private  int i;
     private String name;
     
     public void setId(int id) {
    	 this.i=id;
     }
     public void setName(String name) {
    	 this.name=name;
     }
     public int getId() {
    	 return i;
     }
     public String getName() {
    	 return name;
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		
        encapsulation obj=new encapsulation();
        obj.setId(1);
        obj.setName("ABC");
        
        System.out.println("ID is:-"+obj.getId());
        System.out.println("Name is:-"+obj.getName());
	}

}
