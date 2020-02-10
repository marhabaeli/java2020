package lectureExample.Loop;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		int num, sum=0,cnt=0;
		Scanner scanner=new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			System.out.print("please enter your number: ");
			num=scanner.nextInt();
			
//			if(num<0)
//				continue;
//			
//			sum+=num;
//			cnt++;
			
			if(num>=0) {
				sum+=num;
				cnt++;
			}
		}
		
		System.out.println("count="+cnt+", aver="+sum/cnt);

	}

}
