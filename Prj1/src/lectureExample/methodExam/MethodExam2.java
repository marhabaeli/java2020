package lectureExample.methodExam;

import java.util.Scanner;

public class MethodExam2 {

	public static void main(String[] args) {
		int[][] s={{73,65,78},{98,75,45},{76,89,62}};//initialize array
		Scanner scanner=new Scanner(System.in);
		
		outputSGrade(s);
		
		//count the grades which greater & equal to 75
		int num=75;
		System.out.println("the count which >="+num+"is "+ cntGreaterScore(s, num));
		
		
		//calculate each student’s average grade
		System.out.println("---------Math\tEnglish\tJava\tAverage\tMax");
		getAverAndMax(s);
				

		//find each class’s max grade, min grade and average grade
		getClassSum(s);

	}

	static void outputSGrade(int[][] score){
			
		System.out.println("---------Math\tEnglish\tJava");
		//output
		for(int i=0;i<score.length;i++){
			System.out.print("Student"+(i+1)+"--");
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}

	}
	
	static int cntGreaterScore(int[][] st, int gr){
		int cnt=0;
		for(int i=0;i<st.length;i++){
			for(int j=0;j<st[i].length;j++){
				if(st[i][j]>=75){
//					System.out.println(s[i][j]);
					cnt++;
				}
			}
		}		
		return cnt;
	}
	
	static void getAverAndMax(int[][] st){
		for(int i=0;i<st.length;i++){
			System.out.print("Student"+(i+1)+"--");
			int sum=0;
			int max=0;
			for(int j=0;j<st[i].length;j++){
				System.out.print(st[i][j]+"\t");
				sum+=st[i][j];
				
				max=max<st[i][j]?st[i][j]:max;
//				if(max<s[i][j])
//					max=s[i][j];
//				else 
//					max=max;
				
			}
			System.out.println(sum/st[i].length+"\t"+max);			
		}
	}

	static void getClassSum(int[][] st){
		int[] sum={0,0,0};//sum[0]--math sum, sum[1]--english, sum[2]---java 
		
		for(int i=0;i<st.length;i++){
			for(int j=0;j<st[i].length;j++){
				sum[j]+=st[i][j];
				}
			}	
		System.out.print("sum=\t");
		for(int i=0;i<sum.length;i++){
			System.out.print(sum[i]+"\t");
		}
	}
}
