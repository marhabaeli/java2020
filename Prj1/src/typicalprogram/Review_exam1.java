package typicalprogram;

import java.util.Scanner;

public class Review_exam1 {

	public static void main(String[] args) {
		int array[]=new int[4];
		int sum=0;
		int even,even_i;
		float averge=0.0f;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<array.length;i++){
			System.out.print("enter number" +(i+1));
			array[i]=sc.nextInt();
			even_i=0;
		    if(array[i]%2==0) {
		    	sum+=array[i];
		    	System.out.println(" even " +array[i]);
		    	even_i++;
		    }
		    averge=sum/even_i;
	    	
	    	System.out.println(" averge " +averge);

		}
	}

}
