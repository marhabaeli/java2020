package assignment.loop;

import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args) {
		int max, min, num, con;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("please enter your number");
		num=scanner.nextInt();
		max=min=num;
		System.out.println("continue?(1--yes, 0--no");
		con=scanner.nextInt();
		
		while(con==1){
			System.out.println("please enter your number");
			num=scanner.nextInt();
//			if(max<num){
//				max=num;
//			} 
			max=max<num?num:max;
//			if(min>num){
//				min=num;				
//			}
			min=min>num?num:min;
			
			System.out.println("continue?(1--yes, 0--no");
			con=scanner.nextInt();
		}
		
		System.out.println("max="+max+"\tmin="+min);

	}

}
