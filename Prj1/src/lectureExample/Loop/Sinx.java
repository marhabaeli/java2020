package lectureExample.Loop;

import java.util.Scanner;

public class Sinx {

	public static void main(String[] args) {
		
		int n,x;
		long mehrej;
		float sinx=0.0f, suret;
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter n");
		n=scanner.nextInt();
		System.out.println("enter x");
		x=scanner.nextInt();

		float rad=x*(3.1415f/180.0f);
		int sign=-1;
		sinx=rad;
		suret=rad; mehrej=1;
		for(int i=2;i<=n;i++){
			//derije tepish===suret tepish
			suret*=rad*rad;
			
			//factural tepish===mehrej tepish
			mehrej*=(2*i-1)*(2*i-2);		
			
			sinx+=sign*(suret/mehrej);
			System.out.println("i="+i+" "+sign*(suret/mehrej));
			sign*=(-1);//sign=-sign;
		}		
		System.out.println("sin"+x+"="+sinx);
	}

}
