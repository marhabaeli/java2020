package lectureExample.Loop;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		//using for loop  
//	    for(int i=1;i<=10;i++){  
//	    	//using for loop  
//	    	if(i==5){  
//                break;  
//            }  
//	        System.out.println(i);  
//	    }  
//
//	    System.out.println("Bye-Bye");
		
		
		
//		 //outer loop   
//        for(int i=1;i<=3;i++){    
//                //inner loop  
//                for(int j=1;j<=3;j++){    
//                    if(i==2&&j==2){    
//                         break;    
//                    }    
//                    System.out.println(i+" "+j);    
//                }    
//        }    

		 Double number, sum = 0.0;
	     Scanner input = new Scanner(System.in);
	     

	     while (true) {
	        System.out.print("Enter a number: ");
	        number = input.nextDouble();
	        
	        if (number < 0.0) {
	           break;
	        }
	        sum += number;
	       
		     
	       
	     }
	     System.out.println("Sum = " + sum);

		
	}

}
