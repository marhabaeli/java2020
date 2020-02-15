package assignment.loop;

public class TriangleSrars {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++){
			//space
			for(int b=5-r;b>0;b--){
				System.out.print(" ");
			}
			
			//star
			for(int y=1;y<=2*r-1;y++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
