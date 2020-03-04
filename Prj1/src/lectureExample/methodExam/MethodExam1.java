package lectureExample.methodExam;

import java.util.Scanner;

public class MethodExam1 {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		int x=getSum(num);
		int y=getFact(num);
		int bigsum=getSum(y);
		System.out.println("the sum is "+x);
		System.out.println("the factorial is "+y);
		System.out.println("the biggest is "+max(x, y));
		System.out.println("the lowest is "+min(x, y));
		
	}
	
	static int getSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}		
		return sum;
	}
	
	static int getFact(int n){
		int fac=1;
		for(int i=1;i<=n;i++)
			fac*=i;
		return fac;
	}
	
	static int max(int a, int b){
		return a>b?a:b;
	}
	
	static int min(int a, int b){
		return a<b?a:b;
	}

}
