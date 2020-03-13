package assignment.method;

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		st1.printStuInfo(st1);
		
		Student st2=new Student("Alim");
		st2.printStuInfo(st2);
		
		Student st3=new Student("Adil", "Computer");
		st3.printStuInfo(st3);
		
		Student st4=new Student("Enwer","Art",19);
		st4.score=90;
		st4.printStuInfo(st4);
	}

}

class Student{
	String name;
	String major;
	int age;
	int	score;
	
	Student(){};
	
	Student(String name){
		this.name=name;
		major="computer";
	}
	
	Student(String name, String major){
		this.name=name;
		this.major=major;
		age=18;
	}
	
	Student(String name, String major, int age){
		this.name=name;
		this.major=major;
		this.age=age;
	}
	
	void printStuInfo(Student s){
		System.out.println("name="+s.name);
		System.out.println("major="+s.major);
		System.out.println("age="+s.age);
		System.out.println("score"+s.score);
	}
}
