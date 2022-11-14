package Array_CRUD;


class Employee{
	int id;
	String name;
	//emp constructor
	  Employee(int id,String name){  
		  this.id=id;
		  this.name=name;
		}
	 //show method
	  void show() {
		  System.out.println("Emp Id= "+id+" Emp Name= "+name);
	  }
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a array of employee obj.
		Employee[]  obj =new Employee[2];
		
		// create and initialize actual employee obj using constructor
		obj[0]=new Employee(100,"shrutik");
		obj[1]=new Employee(101,"Pratik");
		
		//display employee obj data
		System.out.println("emp obj 1:-");
		obj[0].show();                          //method call to show data
		System.out.println("Emp obj 2:-");
		obj[1].show();
		
		
		
		

	}

}
