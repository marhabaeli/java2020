package assignment.loop;

import java.util.Scanner;

public class EnterPassword {

	public static void main(String[] args) {
		int psw=12345,num;
		Scanner scanner=new Scanner(System.in);
		int i=1;
		for(;i<=3;i++){
			System.out.print("please enter your password:");
			num=scanner.nextInt();
			
			if(num==psw){
				break;
			}	
			if(i<=3){
			System.out.println("you entered wrong password "+i+" time(s), please re-enter");
			}
			
			if(i==3){
				System.out.println("you have no more chance to enter password, sorry");
			}
		}
		
		if(i<=3){
			System.out.println("Congratulations! you entered right password");
		}
		

	}

}
