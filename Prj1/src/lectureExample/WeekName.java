package lectureExample;

import java.util.Scanner;

public class WeekName {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number(1--7):");
		num=scanner.nextInt();
//		if(num>7 || num<1) {
//			System.out.println("it is an invalid number");
//		}else if(num==1) {
//			System.out.println("Monday");
//		}else if(num==2) {
//			System.out.println("Tuesday");
//		}else if(num==3) {
//			System.out.println("Wednesday");
//		}else if(num==4) {
//			System.out.println("Thursday");
//		}else if(num==5) {
//			System.out.println("Friday");
//		}else if(num==6) {
//			System.out.println("Saturday");
//		}else {
//			System.out.println("Sunday");
//		}

		
		switch (num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("ïnvalid number");
			break;
		}
		
		switch (num) {
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
			
		case 5:
			System.out.println("Workday");
			break;
		case 6:
			
		case 7:
			System.out.println("WeekEnd");
			break;
		default:
			System.out.println("ïnvalid number");
			break;
		}
		
		System.out.println("Thanks for using my program!");
	}

}
