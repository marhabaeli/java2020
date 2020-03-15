package lectureExample.OOP.UPcasting;

public class AbstactClassExam {
	public static void main(String args[]){  
//		Shape s=new Circle1(); 
//		s.draw();  //drawing circle
//		s=new Rectangle();
//		s.draw();//drawing rectangle
//		s=new Triangle();
//		s.draw();//drawing triangle
		
		Shape shape=new Circle1();
		getShape(shape);
		getShape(new Rectangle());
	}  
	
	static void getShape(Shape s){
		s.draw();
	}
}

abstract class Shape{  
	abstract void draw();  
}  

class Rectangle extends Shape{  
	void draw(){System.out.println("drawing rectangle");}  
}  

class Circle1 extends Shape{

	@Override
	void draw() {
		System.out.println("drawing circle");
	}
	
}

class Triangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("drawing triangle");		
	}
	
}