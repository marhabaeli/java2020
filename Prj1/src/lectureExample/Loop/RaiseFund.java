package lectureExample.Loop;

import java.util.Scanner;

public class RaiseFund {

	public static void main(String[] args) {
		int sum=0, money;
		Scanner scanner=new Scanner(System.in);		
		
		for(int i=1;i<=10;i++) {
//			System.out.println("you are the "+i+"-th person to fund\r\n please enter your fund:");
			money=scanner.nextInt(); //30
//			System.out.println("thank you");
			sum+=money;//sum=sum+money
		}
		System.out.println("the sum is "+sum);
	}

}
