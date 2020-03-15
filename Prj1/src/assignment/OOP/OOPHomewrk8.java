package assignment.OOP;

public class OOPHomewrk8 {

	public static void main(String[] args) {
		Employee emp1=new Employee("Robert");
		emp1.year=1994;
		emp1.address="64C- WallsStreat";
		emp1.toString();
		
		Employee emp2=new Employee("Sam", 2000);
		emp2.address="68D- WallsStreat";
		emp2.toString();
		
		Employee emp3=new Employee("John", 1999, "26B-WallsStreet");
		emp3.toString();
	}

}

 class Employee{
	 String name;
	 int year;
	 String address;
	 Employee(String name) {
		this.name=name;
	}
	 
	 Employee(String name, int year) {
		 this.name=name;
		 this.year=year;
	}
	 
	 Employee(String name, int year, String address) {
		this.name=name;
		this.year=year;
		this.address=address;
	}
	 
	 public String toString(){
		 return name+"\t"+year+"\t"+address;
	 }
 }