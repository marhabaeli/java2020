package lectureExample.Loop;

public class DivideBy_3_7 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
//			System.out.print(i+" ");			
			if(i%3==0 && i%7!=0) {
				System.out.println(" *"+i);
			}
		}
		System.out.println("Thank you for using my code");

	}

}
