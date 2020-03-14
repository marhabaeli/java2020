package lectureExample.OOP.Modifiers;

public class PrivateExam {
	public static void main(String args[]){  
		ABC obj = new ABC();  
		obj.disp();
		
	   } 

}


class ABC{
	private int num = 100;
	private int square(int a){
		return a*a;
	   }
	void disp(){
//		num=200;
		System.out.println(square(num));
	}

}