package assignment.loop;
/*
 * You are to write a program that generates 
 * the second, third, and fourth powers of a list of 
 * whole numbers from 1 to n where n is input by the user
 */
public class NumberPower {

	public static void main(String[] args) {
		System.out.println("n\tn^2\tn^3\tn^4\t");
		for(int i=1;i<=5;i++){
			System.out.println(i+"\t"+i*i+"\t"+i*i*i+"\t"+i*i*i*i);
		}

	}

}
