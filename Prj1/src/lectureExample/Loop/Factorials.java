package lectureExample.Loop;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		int num, i=2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your number");
		num=scanner.nextInt();
		System.out.print(num+"=");
		
		while(i<=num/2){
			if(num%i==0){
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
