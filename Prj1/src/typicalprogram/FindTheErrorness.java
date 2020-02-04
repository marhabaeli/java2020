package typicalprogram;

public class FindTheErrorness {

	public static void main(String[] args) {
		int SCHRODINGERS = 15; 
		int highLimit = 20;
		int num;
		for (num = 1 ; num <= highLimit ; ++num) {
			System.out.println(num + " + SCHRODINGERS = " + num + SCHRODINGERS); 
		    if (num + SCHRODINGERS > highLimit) 
				System.out.println("The sum has exceeded " + highLimit);
		}
	}

}
