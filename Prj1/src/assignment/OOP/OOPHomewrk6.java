package assignment.OOP;

public class OOPHomewrk6 {

	public static void main(String[] args) {
		Triangle_2 triangle_2=new Triangle_2(3, 4, 5);
		System.out.println(triangle_2.getArea());
		System.out.println(triangle_2.getPerimeter());
	}

}

class Triangle_2{
	 int a,b,c;
	 
	 public Triangle_2(int a, int b, int c) {
		 this.a=a;
		 this.b=b;
		 this.c=c;
	}
	 double getArea(){
		 double s=(a+b+c)/2.0f;
		 return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	 }
	 int getPerimeter(){
		 return a+b+c;
	 }
}