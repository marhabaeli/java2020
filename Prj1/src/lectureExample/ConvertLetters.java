package lectureExample;

import java.util.Scanner;

public class ConvertLetters {

	public static void main(String[] args) {
		char ch,res;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("please enter your character");
		ch=scanner.next().charAt(0);
		if(ch>='A' && ch<='Z') {  //A--65, a--97
			res=(char)(ch+32);
			System.out.println("the lower case character is "+res);
		}
		else if(ch>='a' && ch<='z') {
			res=(char)(ch-32);
			System.out.println("the upper case charachter is "+res);
		}
		else {
			System.out.println("invalid charachter");
		}

	}

}
