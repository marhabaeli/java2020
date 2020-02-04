package lectureExample;

import java.util.Scanner;

public class ScoreExam {

	public static void main(String[] args) {
		int score;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your score:");
		score=scanner.nextInt();
		
//		if(score<0 || score>100) {
//			System.out.println("you entered an invalid score");
//		} else  if(score>=90) {
//			System.out.println("your score is A");
//		}else if(score>=80) {
//			System.out.println("your score is B");
//		}else if(score>=70) {
//			System.out.println("your score is C");
//		}else if(score>=60) {
//			System.out.println("your score is D");
//		}else {
//			System.out.println("your score is F");
//		}
//>,>=,==,<,<=
		
		
		//2- way
		if(score>100 || score<0) {
			System.out.println("invalid number");
		}else {
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("your score is A");
			break;
		case 8:
			System.out.println("your score is B");
			break;
		case 7:
			System.out.println("your score is C");
			break;
		case 6:
			System.out.println("your score is D");
			break;
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("your score is F");
			break;
			}//switch
		}//if
		
		System.out.println("thanks!");
	}//main

}//class
