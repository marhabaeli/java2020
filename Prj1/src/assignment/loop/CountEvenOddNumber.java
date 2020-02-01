package assignment.loop;
/*
 * Write a program to enter 10 numbers from console, 
 * count the odd numbers and even numbers then print them out.
 */

import java.util.Scanner;

public class CountEvenOddNumber {

	public static void main(String[] args) {
		int cnt_even=0, cnt_odd=0, num;
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			System.out.print("enter the "+i+"-number:");
			num=scanner.nextInt();
			if(num%2!=0){
				cnt_odd++;
			}else{
				cnt_even++;
			}
		}
		System.out.println("you entered "+cnt_even+" even number,\r\n "+cnt_even+" odd number");

	}

}
