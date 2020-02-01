package lectureExample;

import java.util.Scanner;

public class VowelAncCsn {

	public static void main(String[] args) {
		char ch;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("please enter a letter:");
		ch=scanner.next().charAt(0);
		
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			switch(ch) {
			case 'a': case 'A':
			case 'e': case 'E':
			case 'i': case 'I':
			case 'u': case 'U':
			case 'o': case 'O':
				System.out.println("vowel ");
				break;
			default:
				System.out.println("consonant");
				break;
			}
			
		} else {
			System.out.println("invalid input");
		}

	}

}
