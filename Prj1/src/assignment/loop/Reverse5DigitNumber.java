package assignment.loop;
/*
 * Enter a 5 digits number, then print it as reverse sequence, 
 * for example: enter 12345, output 54321
 */

import java.util.Scanner;

public class Reverse5DigitNumber {

	public static void main(String[] args) {
		int num, rev=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your 5 digit number");
		num=scanner.nextInt();
		
		for(int i=1;i<=5;i++){
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println("the reverse number is "+rev);

	}

}
