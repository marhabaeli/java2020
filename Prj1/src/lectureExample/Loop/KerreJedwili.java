package lectureExample.Loop;

public class KerreJedwili {

	public static void main(String[] args) {
//		for(int i=1; i<=9;i++){
//			for(int j=1;j<=9;j++){
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("==============================");
//		
//		for(int i=1; i<=9;i++){
//			for(int j=1;j<=i;j++){
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("==============================");
		
		int a=0;
		for(int i=1;i<=100;i+=2){//1 3 5 7 9 11
			System.out.print(i+" ");
			a++;
			if(a%5==0){
				System.out.println();
			}			
		}
		
	}
	
	
	

}
