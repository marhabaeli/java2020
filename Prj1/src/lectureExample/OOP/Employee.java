package lectureExample.OOP;

public class Employee {
	 int empId;  
	   String empName;  
		    
	   Employee(int id, String name){  
	       empId = id;  
	       empName = name;  
	   }  
	   void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   } 

	   public static void main(String args[]){  
			Employee obj1 = new Employee(10245,"Chaitanya");  
			Employee obj2 = new Employee(92232,"Negan");  
			obj1.info();  
			obj2.info();  
		   }  

}
