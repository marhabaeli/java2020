package lectureExample.Loop;

import java.util.Scanner;

public class WhileLoopExam1 {

	public static void main(String[] args) {
		int num, sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter some numbers, enter 0 for quit");
		num=scanner.nextInt();
		
		while (num!=0) {
			sum+=num;  //sum=sum+num;
			System.out.println("please enter your number:");
			num=scanner.nextInt();
		}
		System.out.println("the sum is "+sum);

		
	}

}
