package lectureExample.Loop;

public class SevenLineStars {

	public static void main(String[] args) {
		/*
		 * ******
		 * ******
		 * ******
		 * ******
		 */
		for(int r=0;r<7;r++){
			for(int c=0;c<5;c++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * *
		 * ***
		 * *****
		 * *******
		 */
	
			for(int r=0;r<7;r++){
				for(int c=0;c<2*r-1;c++){
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
