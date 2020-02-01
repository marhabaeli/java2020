package lectureExample;

import java.util.Scanner;

public class Test_Your_Grade {

	public static void main(String[] args) {

		int grade;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your grade!");
		grade = scanner.nextInt();
		
		if (grade > 100 || grade <0) {
			System.out.println("Invalid score");
		}else if (grade >= 90) {
			System.out.println("Your grade is A!");
		}else if (grade >= 80) {
			System.out.println("Your grade is B!");
		}else if (grade >= 70) {
			System.out.println("Your grade is C!");
		}else if (grade >= 60) {
			System.out.println("Your grade is D!");
		}else {
			System.out.println("Your grade is F!");
		}
	}

}
