package assignment.loop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int num, sum=1;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("please enter your num");
		num=scanner.nextInt();
		
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				sum+=i;
			}
		}
		
		if(num==sum){
			System.out.println(num+ " is a perfect number");
		}else{
			System.out.println(num+" is not a perfect number");
		}

	}

}
