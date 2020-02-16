package lectureExample.Loop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c,n;
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter n");
//		n=scanner.nextInt();
//		System.out.print(a+" "+b+" ");
//		for(int i=3;i<=n;i++){
//			c=a+b;
//			System.out.print(c+" ");
//			a=b; 
//			b=c;
//		}
		
		int arr[]=new int[10];
		arr[0]=0;arr[1]=1;
		
		for(int i=2;i<arr.length;i++){
			arr[i]=arr[i-2]+arr[i-1];
		}
		
		for(int i:arr){
			System.out.println(i);
		}
	}

}
