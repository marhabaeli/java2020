package lectureExample;

import java.util.Scanner;

public class ShippingCost {

	public static void main(String[] args) {
		int pas, dis;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the weight of parsel");
		pas=scanner.nextInt();
		System.out.println("enter the distance:");
		dis=scanner.nextInt();
		
		switch (pas/5) {
		case 0: case 1:
			
			System.out.println(dis/500*1.10);
			break;
		case 2: case 3:
			System.out.println(dis/500*2.3);			
			break;
		case 4: case 5: case 6:
			System.out.println(dis/500*3.6);
			break;
		case 7: case 8: case 9: case 10:
			System.out.println(dis/500*4.9);
			break;

		default:
			System.out.println("invalid");
			break;
		}

	}

}
