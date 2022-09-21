package com.day16_Containment;

class Department{
	private int id;
	private String name;
	//set method
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	//get method
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}

public class Employee_GetterSetter {
	 private int id;
	 private String name;
	 private Department dep;    //Department is class and d is the object
	 //set method
	 public void setId(int id) {      //set ID
		 this.id=id;
	 }
	 public void setName(String name) {  //set name
		 this.name=name;
	 }
	 public void setDepartment(Department d) {       //set department
		 this.dep=dep;
	 }
	 //get method
	 public int getId() {
		 return id;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public Department dep() {
		 return dep;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_GetterSetter e=new Employee_GetterSetter();
		e.setId(1);
		e.setName("Shrutik");
		e.setDepartment(new Department());
		
		Department dep=new Department();
		dep.setId(2322);
		dep.setName("Computer");
        
		System.out.println(e.getId()+" "+e.getName()+" "+dep.getID()+" "+dep.getName());
	}

}
