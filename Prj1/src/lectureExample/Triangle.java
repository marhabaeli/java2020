package lectureExample;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int a,h,area;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a ");
		a = scanner.nextInt();
		System.out.print("Please enter h ");
		h = scanner.nextInt();
		
		area =a*h/2;   //    s=1/2*h*a;
		System.out.println(area);
	}
}
