package lectureExample.Array.String;

import java.util.Scanner;

public class StringExample {
	public static void main(String args[]) {
		String string="";
		Scanner scanner=new Scanner(System.in);
		
		string=scanner.nextLine();
		System.out.println(string);
		
		String[] str=string.split("[ ]");
		System.out.println(str[2]);
	   }
}
