package typicalprogram;

public class WhileLoopExample {

	public static void main(String[] args) {
		boolean shouldContinue = false;

		while(shouldContinue==false) {
		    System.out.println("running");
		    double random = Math.random() * 100;
		//0--1
		    if(random > 5) {
		        shouldContinue = true;
		    } else {
		        shouldContinue = false;
		    }

		}


	}

}
