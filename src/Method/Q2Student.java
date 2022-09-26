package Method;
/*Create getId() method in Student class. call getId() method 
from displayData method so that you know that one 
method can be called from another method. Return id 
from getId() method and set that id to the instance 
variable in displayData method. */


public class Q2Student {
	public int getId(int id) {
	   return id;
	}
	void displayData() {
		 
		int n=this.getId(6);  // invoke the current class method
		System.out.println("The Id Of student is : "+n);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Q2Student s=new Q2Student();
          s.displayData();
	}

}
