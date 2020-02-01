package lectureExample;

import java.util.Scanner;

public class ConvetF2C {

	public static void main(String[] args) {
		int choose,degree;
		float result;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1, Celsius to Fahrenheit\r\n2, Fahrenheit to Celsius");
		System.out.print("Please select one of them (1 or 2)?");

		choose=scanner.nextInt();
		System.out.print("please enter your degree:");
		degree=scanner.nextInt();

		if(choose==1) {
			result=(degree*5/9.0f)+32.0f;
			System.out.println("it is "+result+" Fahranheit");
		}else if(choose==2) {
				result=(degree-32)*5/9.0f;
				System.out.println("it is "+result+" Celsius");
			}else {
				System.out.println("you entered invalid number");
		}
	}

}
