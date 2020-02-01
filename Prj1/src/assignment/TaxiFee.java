package assignment;

import java.util.Scanner;

public class TaxiFee {

	public static void main(String[] args) {
		int dist;
		float fee;
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter your distance: ");
		dist=scanner.nextInt();
		
		if(dist<=3) {
			fee=10;
		}else {
			fee=10+(dist-3)*0.5f;
		}
		
		System.out.println("Your taxi fee is "+fee);

	}

}



