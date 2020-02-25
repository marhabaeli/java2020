package lectureExample.Array;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		int[][] s={{73,65,78},{98,75,45},{76,89,62}};//initialize array
		Scanner scanner=new Scanner(System.in);
		
		//or enter numbers from console to array with
		
		//traditional way
//		s[0][0]=scanner.nextInt();
//		s[0][1]=scanner.nextInt();
//		s[0][2]=scanner.nextInt();
//		s[0][3]=scanner.nextInt();
//		
//		s[1][0]=scanner.nextInt();
//		s[1][1]=scanner.nextInt();
//		s[1][2]=scanner.nextInt();
//		s[1][3]=scanner.nextInt();
//		
//		s[2][0]=scanner.nextInt();
//		s[2][1]=scanner.nextInt();
//		s[2][2]=scanner.nextInt();
//		s[2][3]=scanner.nextInt();
		
		//use loop
//		for(int i=0;i<s.length;i++){
//			for(int j=0;j<s[i].length;j++){
//				s[i][j]=scanner.nextInt();
//			}
//		}
		
		//output array's values 		
		System.out.println("---------Math\tEnglish\tJava");
		//output
		for(int i=0;i<s.length;i++){
			System.out.print("Student"+(i+1)+"--");
			for(int j=0;j<s[i].length;j++){
				System.out.print(s[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//count the grades which greater & equal to 75
		
		System.out.println("the student's score >=75");
		int cnt=0;
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s[i].length;j++){
				if(s[i][j]>=75){
//					System.out.println(s[i][j]);
					cnt++;
				}
			}
		}		
		System.out.println("cnt="+cnt);
		
	//calculate each student’s average grade
		
		//int sum;
		System.out.println("---------Math\tEnglish\tJava\tAverage\tMax");
		for(int i=0;i<s.length;i++){
			System.out.print("Student"+(i+1)+"--");
			int sum=0;
			int max=0;
			for(int j=0;j<s[i].length;j++){
				System.out.print(s[i][j]+"\t");
				sum+=s[i][j];
				
				max=max<s[i][j]?s[i][j]:max;
//				if(max<s[i][j])
//					max=s[i][j];
//				else 
//					max=max;
				
			}
			System.out.println(sum/s[i].length+"\t"+max);			
		}
				
		
		//find each class’s max grade, min grade and average grade
		int[] sum={0,0,0};//sum[0]--math sum, sum[1]--english, sum[2]---java 
		
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s[i].length;j++){
				sum[j]+=s[i][j];
				}
			}	
		System.out.print("sum=\t");
		for(int i=0;i<sum.length;i++){
			System.out.print(sum[i]+"\t");
		}
		
	}
}

