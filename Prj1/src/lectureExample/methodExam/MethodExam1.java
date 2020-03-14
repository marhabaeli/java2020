package lectureExample.methodExam;

import java.util.Scanner;

public class MethodExam1 {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		MethodExam1 obj1=new MethodExam1();
		int x=obj1.getSum(num);
		int y=obj1.getFact(num);
		int bigsum=obj1.getSum(y);
		System.out.println("the sum is "+x);
		System.out.println("the factorial is "+y);
		System.out.println("the biggest is "+obj1.max(x, y));
		System.out.println("the lowest is "+min(x, y));
		
	}
	
	 int getSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}		
		return sum;
	}
	
	 int getFact(int n){
		int fac=1;
		for(int i=1;i<=n;i++)
			fac*=i;
		return fac;
	}
	
	 int max(int a, int b){
		return a>b?a:b;
	}
	
	static int min(int a, int b){
		return a<b?a:b;
	}

}
