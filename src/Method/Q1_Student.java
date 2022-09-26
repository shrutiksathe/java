package Method;
/*add method displayData inside Student class change 
values of id name in that method & also print the changed 
values in same method. Call displayData method from 
main method and see the output. Observe displayData can 
only be called by creating object of Student */


public class Q1_Student {
	int id=2;
	String name="Shrutik";
	void displayData() {
		int id2=id;     //change id
		id=3;
		String nm="Sam";
		name=nm;        //change name
		System.out.println(id);
		System.out.println(nm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Q1_Student s=new Q1_Student();
      s.displayData();
	}

}
