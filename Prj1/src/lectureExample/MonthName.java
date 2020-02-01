package lectureExample;

import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		int month;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter a number(1--12):");
		month=scanner.nextInt();
		//switch 1
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aughust");
			break;
		case 9:
			System.out.println("September");
			break;		
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("invalid number");
			break;
		
		}//switch
		
		
		//switch 2
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter season");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring season");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer season");
			break;
		case 9:		
		case 10:
		case 11:
			System.out.println("Fall season");
			break;
		default:
			System.out.println("invalid number");
			break;		
		}
		
		//switch 3
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Big month,31 days");
			break;
			
		case 4:
		case 6:	
		case 9:			
		case 11:
			System.out.println("Small month, 30 days");
			break;
		
		case 2:
			int year;
			System.out.println("please enter the year:");
			year=scanner.nextInt();
			
			if((year%4==0 && year%100!=0) || year%400==0) {
				System.out.println("Small month,29 days");
			}else {
				System.out.println("Small month,28 days");
			}
			break;
			
		default:
			System.out.println("invalid number");
			break;
		
		}//switch
		
		System.out.println("Thanks for using this program");
		
	}//main

}//class
