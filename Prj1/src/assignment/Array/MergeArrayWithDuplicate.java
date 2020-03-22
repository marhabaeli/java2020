package assignment.Array;

import java.util.Scanner;

public class MergeArrayWithDuplicate {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[4];
		int c[]=new int[a.length+b.length];
		Scanner scanner=new Scanner(System.in);
		//***************method 1*******************
		//enter numbers to array A
		for(int i=0;i<a.length;i++){
			System.out.print("a["+(i+1)+"]=");
			a[i]=scanner.nextInt();
		}
		
		//enter numbers to array B
		for(int i=0;i<b.length;i++){
			System.out.print("b["+(i+1)+"]=");
			b[i]=scanner.nextInt();
		}
		
		//merge array A with array B 
		int j=0; int t1=0;
		while(j<a.length && j<b.length){
			c[t1++]=a[j];
			c[t1++]=b[j++];
		}
		
		if(a.length>b.length){
			for(;j<a.length;j++){
				c[t1++]=a[j];
			} 
		}else if(a.length<b.length){
				for(;j<b.length;j++){
					c[t1++]=b[j];
			}
		}
		
		//output array C
		for(int i=0;i<c.length;i++){
			System.out.println("c["+(i+1)+"]="+c[i]);
		}
		
//	********************method 2 ***********************
		//enter numbers to array A, then copy to array C
		int t2=0;
		for(int i=0;i<a.length;i++){
			System.out.print("a["+(i+1)+"]=");
			a[i]=scanner.nextInt();
			c[t2++]=a[i];
		}
		
		//enter numbers to array B, then coput to array C
		for(int i=0;i<b.length;i++){
			System.out.print("b["+(i+1)+"]=");
			b[i]=scanner.nextInt();
			c[t2++]=b[i];
		}
		//output array C
		for(int i=0;i<c.length;i++){
			System.out.println("c["+(i+1)+"]="+c[i]);
		}
	}
}
