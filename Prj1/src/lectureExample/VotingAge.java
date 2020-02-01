package lectureExample;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		int age;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your age: ");
		age=scanner.nextInt();
		
		if(age>=18) { //>, =, <
			System.out.println("you are eligable for voting");
		}
		else {
			System.out.println("you are not eligable for voting");
		}

	}
	
	
	

}
