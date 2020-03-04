package lectureExample.Array;

import java.util.Scanner;

import javax.swing.text.html.MinimalHTMLWriter;

/*
 * Write a code, enter 20 integer numbers, then find the average number of them
 *  after removing the max number and min number.

 */
public class ArrayAverage {

	public static void main(String[] args) {
		int a[]=new int[10];
		int max,min,max_i, min_i;
		float aver, sum=0.0f;
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0; i<a.length;i++){
			System.out.print("enter number "+(i+1));
			a[i]=scanner.nextInt();
		}
		
		max=min=a[0]; min_i=max_i=0;
		for(int i=1;i<a.length;i++){
//			max=max<a[i]?a[i]:max;
			if(max<a[i]){
				max=a[i];
				max_i=i;
			}
			
			if(min>a[i]){
				min=a[i];
				min_i=i;
			}
		}
			
		for(int i=0;i<a.length;i++){
			if(i==max_i||i==min_i){
				continue;
			}
			sum+=a[i];
		}
		
		aver=sum/(a.length-2);
		System.out.println("average="+aver);
	}

}
