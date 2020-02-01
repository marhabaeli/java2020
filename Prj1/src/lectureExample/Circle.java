package lectureExample;
import java.util.Scanner;

public class Circle {

	public static void main(String[] a) {
		int r, dr;		
		
		float π,area, pre;  
		π = (float)3.14; // cast
		Scanner sc = new Scanner(System.in);		
	
			System.out.print("Please enter r ");
			r = sc.nextInt();
			dr = 2*r;
			
			area = r*r * π;
			System.out.println(area);
			
			pre = π * dr;
				System.out.println(pre);
	}

}


