package lectureExample.OOP;

public class Point {
	int i,j;
	Point(int x, int y){
		i=x;j=y;
	}
	Point(){}
	
	public static void main(String[] args) {
		Point obj1=new Point();
		System.out.println(obj1.i+" "+obj1.j);
		obj1.i=10;
		obj1.j=20;
		System.out.println(obj1.i+" "+obj1.j);
		
				
		Point obj2=new Point(30,40);
		System.out.println(obj2.i+" "+obj2.j);
	}

}
