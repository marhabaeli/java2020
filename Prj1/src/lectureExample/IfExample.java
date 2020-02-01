package lectureExample;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
//		float num;
//		Scanner a=new Scanner(System.in);
//		System.out.println("decide if the number is odd or even");
//		System.out.print("please enter a integer number: ");
//		num=a.nextFloat();
//		
//		if(num%2==0) {
//			System.out.println("it is a even number");
//		}else {
//			System.out.println("it is a odd number");
//		}
		
//		char ch;
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("please input a charachter: ");
//		ch=scanner.next().charAt(0);
//		
//		if(ch=='y' || ch=='Y' ) {
//			System.out.println("you entered YES");
//		}else if(ch=='n' || ch=='N')	{
//						System.out.println("ÿou entered NO");
//						}
//			else {
//				System.out.println("You entered neither y nor n");
//			}
//		System.out.println("Bye-Bye");
		
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		
		if(num1>=num2) {//>=<
			System.out.println(num2+" "+num1);
		}else {
			System.out.println(num1+" "+num2);
		}
		
		
		
	}

}
