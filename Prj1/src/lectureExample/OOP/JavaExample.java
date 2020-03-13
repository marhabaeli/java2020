package lectureExample.OOP;

public class JavaExample{
	   
	   static int var1=77; 
	       String var2;

	   public static void main(String args[])
	   {
		JavaExample ob1 = new JavaExample();
		JavaExample ob2 = new JavaExample();
		
		ob1.var1=88;
		ob1.var2="I'm Object1";
		System.out.println("ob1 integer:"+ob1.var1); //88
		System.out.println("ob1 String:"+ob1.var2);  
		
	     ob2.var1=99;
		ob2.var2="I'm Object2";		
		System.out.println("ob2 integer:"+ob2.var1);//99
		System.out.println("ob2 STring:"+ob2.var2); 
	   }
	}

