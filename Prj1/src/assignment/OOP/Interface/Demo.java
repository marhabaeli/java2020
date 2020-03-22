package assignment.OOP.Interface;

public class Demo implements IMultiply{

	@Override
	public int multiplyTwo(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	@Override
	public int multiplyThree(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		return n1*n2*n3;
	}
	
	public static void main(String[] args) {
		IMultiply obj=new Demo();
		System.out.println(obj.multiplyTwo(3, 7));
	    System.out.println(obj.multiplyThree(1, 9, 2));

	}
}
