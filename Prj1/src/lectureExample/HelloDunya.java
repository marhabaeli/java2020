package lectureExample;

import java.util.Scanner;

public class HelloDunya {	
	public static void main(String[] args) {
		/*
		 * int x=10, j=20;
		int a, t=0;          
		 float f1=2.5f;
		 int m,n=0;
				
		x++; //x=11
		System.out.println("x="+x);
		j--; //j=19
		System.out.println("j="+j);
		++x; //x=12 
		System.out.println("x="+x);
		--j;  //j=18
		System.out.println("j="+j);
		a=t++;  //a=0   t=1
		 System.out.println("a="+a+" "+"t="+t);
		 t=5;    //t=5
		 System.out.println("t="+t);
		 a=++t; //t=6   a=6
		 System.out.println("a="+a+" "+"t="+t);
		 a=x++;  //a=12  x=13
		 System.out.println("a="+a+" "+"x="+x);
		 */
	
//		int a,b,c;  
		byte dad_age=0;
		byte mom_age=0;
		byte son_age=0;
		byte daughter_age=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter your father's age:");
		dad_age=scanner.nextByte();  
		System.out.print("please enter your mom's age:");
		mom_age=scanner.nextByte();
		System.out.print("please enter your son's age:");
		son_age=scanner.nextByte();
		System.out.print("please enter your daughter's age:");
		daughter_age=scanner.nextByte();		
		
		int sum_age=dad_age+mom_age+son_age+daughter_age;
		float ave_age=sum_age/4;
		System.out.print("dad's age is "+dad_age);
		System.out.println(", mom's age is "+mom_age);
		System.out.print("son's age is "+son_age);
		System.out.println(", doughter's age is "+daughter_age);
		System.out.print("the family's overall age is "+sum_age);
		System.out.println("and average age is "+ave_age);
		System.out.println("Does dadi is older than mom? "+(dad_age>mom_age));
		System.out.println("are they children twins? "+(son_age==daughter_age));
		System.out.println("how many years old the son than daughter? "+(son_age-daughter_age));
		 
		}

	
	void setA() {
		
	}

}

class A{
	void sayHello(int i) {
		System.out.println("I am in class A");
	}
	
}


class B{
	
}
