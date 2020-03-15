package assignment.OOP;

public class OOPHomewrk7 {

	public static void main(String[] args) {
		Rectangle rectangle1=new Rectangle(4, 5);
		Rectangle rectangle2=new Rectangle(5, 6);
		
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle2.getArea());
	}

}

 class Rectangle{
	 int width;
	 int length;
	 public Rectangle(int width, int length) {
		this.width=width;
		this.length=length;
	}
	 
	 int getArea(){
		 return width*length;
	 }
 }