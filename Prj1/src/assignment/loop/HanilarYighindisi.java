package assignment.loop;

import java.util.Scanner;

public class HanilarYighindisi {

	public static void main(String[] args) {
		int num, sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your number");
		num=scanner.nextInt();
//		while(num!=0){
//			sum+=num%10;
//			num/=10; //num=num/10;
//		}
		
		for(;num!=0;){
			sum+=num%10;
			num/=10;
		}
		System.out.println("sum="+sum);

	}

}
