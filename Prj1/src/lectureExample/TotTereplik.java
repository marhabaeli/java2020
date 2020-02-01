package lectureExample;

import java.util.Scanner;

public class TotTereplik {

	public static void main(String[] args) {
		int a,b,area,per;
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter the a:");
		a=scanner.nextInt();
		System.out.print("please enter the b:");
		b=scanner.nextInt();
		
		area=a*b;
		per=2*(a+b);
		
		System.out.println("the area is "+area);
		System.out.println("the perimeter is "+per);
	}

}
