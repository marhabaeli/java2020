package assignment.OOP;

public class OOPHomewrk5 {

	public static void main(String[] args) {
		Triangle_1 triangle=new Triangle_1();
		triangle.a=3;
		triangle.b=4;
		triangle.c=5;

		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimeter());
	}

}

 class Triangle_1{
	 int a,b,c;
	 double getArea(){
		 double s=(a+b+c)/2.0f;
		 return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	 }
	 int getPerimeter(){
		 return a+b+c;
	 }
 }