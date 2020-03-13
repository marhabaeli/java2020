package lectureExample.OOP;

import java.util.Scanner;

public class CunstructorExam {
	static int x=10;
	int y;
	
	public static void main(String[] args) {
					
		CunstructorExam obj1=new CunstructorExam();
		System.out.println("x="+x);
		x=20;

	}
	
	CunstructorExam() {
		System.out.println("Constructor called");
		x=5;
	}

}

class prog{
	void method1(){
		CunstructorExam.x=10;
		CunstructorExam obj1=new CunstructorExam();
		obj1.y=10;
	}
}
