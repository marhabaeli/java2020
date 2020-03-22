package assignment.Array;

import java.util.Scanner;

public class MergeArrayWithoutDuplicate {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[6];
		int c[]=new int[a.length+b.length];
		Scanner scanner=new Scanner(System.in);
		
		//enter numebrs to array A, then copy to array C
		int t=0;
		for(int i=0;i<a.length;i++){
			System.out.print("a["+(i+1)+"]=");
			a[i]=scanner.nextInt();
			c[t++]=a[i];
		}
		
		//enter number to array B, then copy to array C
		for(int i=0;i<b.length;i++){
			System.out.print("b["+(i+1)+"]=");
			b[i]=scanner.nextInt();
			int j=0;
			for(;j<t;j++){
				if(c[j]==b[i])
					break;
			}
			if(j>=c.length){
				c[t++]=b[i];
			}
		}
	}

}
