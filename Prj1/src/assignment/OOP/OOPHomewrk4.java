package assignment.OOP;

public class OOPHomewrk4 {
	public static void main(String[] args) {
		Student student=new Student("Alim", 2);
		
		//below is an extra code which didn't be requested in homework 
		System.out.println(student.name+" "+student.roll_no);
	}
}

 class Student{
	 String name;
	 int roll_no;
	 public Student(String name, int roll_no) {
		this.name=name;
		this.roll_no=roll_no;
	}
 }