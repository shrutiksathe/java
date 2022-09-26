package Method;
//create another method in Student class setCustomData(int 
//customId, String customName) These 2 variables are local 
//variables. Call setCustomData from main method using 
//Student object and assign any values to customId, 
//customName from main method. Observe your values are 
//overwritten in id and name instance variables. Then print 
//id and name in main method. 

public class Q3Student {
	
	public void setCustomData(int customID,String customName) {
		 System.out.println(customID);
		 System.out.println(customName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Q3Student s=new Q3Student();
         s.setCustomData(1,"Shrutik");
         //System.out.println("------Instance Variable----");
         
        // System.out.println("ID"+s.customID+"name "+s.customName);
	}

}
