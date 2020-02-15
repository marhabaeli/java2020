package lectureExample.Loop;

import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		int ran, guess;
		Scanner scanner=new Scanner(System.in);
		
		ran=(int)(Math.random()*10);
		System.out.println("ran="+ran);
		
		do{
			System.out.println("enter your guess number");
			guess=scanner.nextInt();
			
			if(guess>ran){
				System.out.println("your number is too high, try again");
			}else if(guess<ran){
				System.out.println("your number is too low, try again");
			}	
			
		}while(guess!=ran);
		
		
		System.out.println("congrats! the number is "+ran);

	}

}
