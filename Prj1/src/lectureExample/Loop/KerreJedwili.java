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
		
		int c=0;
		for(int i=1;i<=100;i+=2){
			System.out.print(i+" ");
			c++;
			if(c%5==0){
				System.out.println();
			}			
		}
		
	}
	
	
	

}
