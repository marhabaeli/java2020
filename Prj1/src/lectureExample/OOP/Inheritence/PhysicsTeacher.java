package lectureExample.OOP.Inheritence;

public class PhysicsTeacher extends Teacher {
	String mainSubject = "Physics";
	   public static void main(String args[]){
		PhysicsTeacher obj = new PhysicsTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
		
	   }
}



 class Teacher {
	String designation = "Teacher";
	String collegeName = "University of Kansas";
	int does(){
		System.out.println("Teaching");
		return 100;
	}
	   public static void main(String[] args) {
		System.out.println("I am a teacher");
	}
}