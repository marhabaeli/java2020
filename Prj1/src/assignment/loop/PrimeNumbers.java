package assignment.loop;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter your number");
		n=scanner.nextInt();
		int cnt=0;
		for(int i=2;i<=n;i++){
			int d=2;
			for(;d<=i/2;d++){
				if(i%d==0){
					break;
				}
			}
			if(d>i/2){
				System.out.print(i+"\t");
				cnt++;
			}
			if(cnt%5==0){
				System.out.println();
			}
		}

	}

}
