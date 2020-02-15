package assignment.loop;

import java.util.Scanner;

public class Counters {

	public static void main(String[] args) {
		int num, p=0, n=0, z=0;
		Scanner scanner=new Scanner(System.in);
		
		while(true){
			System.out.println("enter your number");
			num=scanner.nextInt();
			if(num>0) p++;
			else if(num<0) n++;
			else z++;
			
			System.out.println("continue? (yes--1, no---0)");
			num=scanner.nextInt();
			if(num!=1)
				break;
		}
		
		System.out.println("positive="+p+"\tnegative="+n+"\tzero="+z);

	}

}
