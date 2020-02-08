package assignment.loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num, mul=1, i=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter your number: ");
		
		num=scanner.nextInt();
//		while(i<=num){
//			mul*=i;
//			i++;
//		}
		
		for(;i<=num;i++){
			mul*=i;
		}
		System.out.println(num+"!="+mul);
	}

}
