package lectureExample;

import java.util.Scanner;

public class MyCalc {

	public static void main(String[] args) {
		float n1, n2;
		char op;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("please enter the first number:");
		n1=scanner.nextFloat();
		System.out.print("please enter the second number:");
		n2=scanner.nextFloat();
		System.out.print("please enter the operator(+,-,*,/):");
		op=scanner.next().charAt(0);
		
		switch (op) {
		case '+':
			System.out.println("the sum is "+(n1+n2));
			break;
		case '-':
			System.out.println("the difference is "+(n1-n2));
			break;
		case '*':
			System.out.println("the times is "+(n1*n2));
			break;
		case '/':
			if(n2!=0) {
			System.out.println("the division is "+(n1/n2));
			} else {
				System.out.println("invalid dominant");
			}
			break;
		default:
			System.out.println("invalid");
			break;
		}
		
	}

}
