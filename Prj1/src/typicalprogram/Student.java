package typicalprogram;

public class Student implements Comparable<Student>{
	String name;
	int age;
	String id;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String id, int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	@Override
	public int compareTo(Student o) {
//		return id.compareTo(o.id); //campare with id (String)
		return name.compareTo(o.name);
//		if(age>o.age)
//			return 1;
//		else if(age<o.age)
//			return -1;
//		else {
//			return 0;
//		}
	}
	@Override
	public String toString(){
		return id+", "+name+", "+age+"\r\n";
	}
}
