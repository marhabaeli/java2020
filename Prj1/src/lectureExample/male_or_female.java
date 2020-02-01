package lectureExample;

import java.net.CacheRequest;
import java.util.Scanner;

public class male_or_female {

	public static void main(String[] args) {
//		char i;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("If you are a male please type m or M, if you are a female please type f or F ");
//		i = scanner.next().charAt(0);
//		
//		if(i == 'm' || i == 'M') {
//			System.out.println("You are a male.");
//		} else if (i == 'f' || i == 'F') {
//			System.out.println("You are female!");
//		}else {
//			System.out.println("Please enter f/F or m/M!");
//		}
//		
		int pound;
		Scanner scanner=new Scanner(System.in);
		pound=scanner.nextInt();
		float res=0.0f;
		
		switch(pound/10) {
		case 0: //0--9
			res=1.2f; break;
		case 1: //10--19
			res=2.3f; break;
		case 2:
		case 3: //20--34
			if(Math.round(pound)==2)
				res=3.6f; 
			else {
				res=4.2f;
			}
			break;
		case 4: //35--49
			res=4.2f; break;
			
		}
		System.out.println(res);
	}

}
