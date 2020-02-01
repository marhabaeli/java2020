package lectureExample;

import java.util.Scanner;

public class CalculateWeight {

	public static void main(String[] args) {
		float height;
//		char gender; //f: female, m:male
		int gender;
		float weight=0.0f;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("enter your height:");
		height=scanner.nextFloat();
		
		System.out.print("enter your gender, female--1, male--0:");
//		gender=scanner.next().charAt(0);
		gender=scanner.nextInt();
		
//		if(gender=='f'|| gender=='F') {
//			weight=49+(height-60)*1.7f; //female weight
//			System.out.println("your ideal weight is: "+weight);
//		}
//		else if(gender=='m'|| gender=='M'){
//			weight=52+(height-60)*1.9f; //male weight
//			System.out.println("your ideal weight is: "+weight);
//		}else {
//			System.out.println("you entered an invalid gender");
			
		
//		}
		
		if(gender==1) {
			weight=49+(height-60)*1.7f; //female weight
			System.out.println("your ideal weight is: "+weight);
		} else if(gender==0) {
			weight=52+(height-60)*1.9f; //male weight
			System.out.println("your ideal weight is: "+weight);
		}else {
			System.out.println("you entered an invalid gender");
		
	}
		}

}
