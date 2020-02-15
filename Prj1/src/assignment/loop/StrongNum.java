package assignment.loop;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		int num, q,sum=0,t;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your number");
		num=scanner.nextInt();
		t=num;
		
		while(num>0){
			q=num%10; //qalduqni alimiz
			
			int fac=1;
			for(int i=2;i<=q;i++){
				fac*=i;//fac=fac*i
			}
			
			sum+=fac;
			num/=10; //num=num/10				
		}
		
		if(sum==t){
			System.out.println(t+" is a strong number");
		}else{
			System.out.println(t+" is not a strong number");
		}

	}

}
