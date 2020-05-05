package lectureExample.OOP.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
//		int[] a=new int[5];
//		for(int i=0;i<=5;i++){
//			a[i]=i;
//			System.out.println(a[i]);
//		}
//		try{
//		String str = null; //””
//		System.out.println(str.length());
//		}catch (Exception e){
////			e.printStackTrace();
//			System.out.println("exception occured");
//		}
		
//		try{
//	         int a[]=new int[7];
//	         a[4]=30/5;
//	         System.out.println("First print statement in try block");
//	     }
//		 catch(ArithmeticException e){
//		        System.out.println("Warning: ArithmeticException");
//		     }
//		     catch(ArrayIndexOutOfBoundsException e){
//		        System.out.println("Warning: ArrayIndexOutOfBoundsException");
//		     }
//		     catch(Exception e){
//		        System.out.println("Warning: Some Other exception");
//		     }
//		
//	   System.out.println("Out of try-catch block...");
		
		try{  
			 int num=121/0;  
			 System.out.println(num);  
		      }  
		      catch(ArithmeticException e){
//		    	  e.printStackTrace();
		         System.err.println("Number should not be divided by zero");
		      }  
		      finally{
			 System.out.println("This is finally block");
		      }  
		      
		System.out.println("Out of try-catch-finally");  

	}

}
