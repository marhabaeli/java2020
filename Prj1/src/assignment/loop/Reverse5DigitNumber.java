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
		num=scanner.nextInt();//12345
		/*
		 * i=1  0*10+5-->rev=5
		 * 		num/10-->num=1234 
		 * i=2  5*10+4-->54
		 * 		num/10-->num=123
		 */
		for(int i=1;i<=5;i++){
			rev=rev*10+num%10;
			num/=10;//num=num/10;
		}
		System.out.println("the reverse number is "+rev);

	}

}
