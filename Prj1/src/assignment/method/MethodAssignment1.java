package assignment.method;

import java.util.Scanner;

public class MethodAssignment1 {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("input your number:");
		num=scanner.nextInt();
		System.out.println(num+" is prime number?"+isPrime(num));
		System.out.println(num+"!="+getFact(num));
		System.out.println("sum="+getSumUntil(num));
		
	}
	
	static boolean isPrime(int x){
		boolean res=false;
		int i;
		for(i=2;i<=x/2;i++){
			if(x%i==0){
				break;
			}
		}
		if(i>x/2)
			res=true;
		
		return res;
	}
	
	static long getFact(int x){
		long res=1;
		for(int i=2;i<=x;i++)
			res*=i;
		
		return res;
	}
	
	static int getSumUntil(int t){
		int sum=0, i=1;
		while(sum<t){
			if(sum+i<t)
				sum+=i++;//sum=sum+i; i++
			else 
				break;
		}		
		return sum;		
	}
}
