package assignment.loop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num,sum=0, q, t;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your number");
		num=scanner.nextInt();
		t=num;
		
		while(num!=0){
			q=num%10;
			sum+=q*q*q;
			num/=10; //num=num/10
		}
		if(sum==t){
			System.out.println(t+" is an armstrong number");
		}else{
			System.out.println(t+" is NOT an armstrong number");
		}

	}

}
