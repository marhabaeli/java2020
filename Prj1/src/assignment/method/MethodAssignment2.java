package assignment.method;

public class MethodAssignment2 {

	public static void main(String[] args) {
		int[][] stu={{78,90,86,77}, {88,75,97,68},{91,74,88,89},{56,87,98,67},{87,87,67,54},{98,78,99,46}};
		
		printLine();
		System.out.println("|	Math	|	English	|	Art	|	History	|");
		printLine();
		
		for(int i=0;i<stu.length;i++){
			printScore(stu[i]);
			System.out.println();
			printLine();
		}

	}

	static void printLine(){
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void printScore(int[] a){
		for (int v:a) {
			System.out.print("|\t"+v+"\t");
		}
		System.out.print("|");
	}
}
