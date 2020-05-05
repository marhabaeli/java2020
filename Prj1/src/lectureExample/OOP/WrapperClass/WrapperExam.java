package lectureExample.OOP.WrapperClass;

public class WrapperExam {
	public static void main(String[] args) {
		 Double dd=7.867;
		 double d3=8.0987;  
		 
		 Double D = new Double("6.9685");  //D=6.9685;
		 System.out.println(D);
		 
		 int i = D.intValue();  //6
         float f = D.floatValue();  //6.9685
         double d = D.doubleValue();  //unboxing, 
         System.out.println("i="+i+"\t"+"f="+f+"\t"+"d="+d);
         
         float f2=3.4567f;
         Double d4=(double) f2; 
         
         int z = Integer.parseInt("654");  
         long l = Long.parseLong("2158611234"); 
         System.out.println("z="+z+"\t"+"l="+l);
         
         Integer t =Integer.valueOf(50);  
//         Integer t1=50;
         Integer n = Integer.valueOf("333"); 
         System.out.println("t="+t+"\t"+"n="+n);         
	}
}
