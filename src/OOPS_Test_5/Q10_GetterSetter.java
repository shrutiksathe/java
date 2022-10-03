package OOPS_Test_5;
class Department{
	private String name;
	private String add;
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setAdd(String add) {
		this.add=add;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	
}
 class Employee{
	private int id;
	private String name="hi";
	private boolean isManager;
	private float salary;
	Department dep;
	public void setId(int id) {
		this.id=id;
	}
	public void setisManager(boolean isManager) {
		this.isManager=isManager;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
	public void dep(Department dep) {
		this.dep=dep;
	}
	public int getId() {
		return id;
	}
	public boolean getisManager() {
		return isManager;
	}
	public float getsalary() {
		return salary;
	}
	public Department getdep() {
		return dep;
	}
	
}
public class Q10_GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(101);
		e.setisManager(true);
		e.setSalary(40000f);
		e.getId();
		e.getsalary();
		
		Department d=new Department();
		d.setName("amar");
		d.setAdd("pune");

	}

}
