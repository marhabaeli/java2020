package assignment.loop;

import java.util.Scanner;

/*
 * Write a program that prompts the user to input 10 integer number. 
 * It should then print the sum of the positive numbers.
 */

public class SumOfTenNumber {

	public static void main(String[] args) {
		int num, sum=0;
		Scanner scanner=new Scanner(System.in);
		
		for(int i=1;i<=10;i++){
			System.out.print("input your "+i+"-number");
			num=scanner.nextInt();
			sum+=num;
		}
		
		System.out.println("the 10 numbers sum is "+sum);

	}

}
