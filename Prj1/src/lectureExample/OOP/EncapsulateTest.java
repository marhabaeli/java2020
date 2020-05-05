package lectureExample.OOP;

public class EncapsulateTest {

	public static void main(String[] args) {
		EncapsulateDemo obj=new EncapsulateDemo();
		obj.setSsn(34532);
		obj.setEmpname("Memet");
		obj.setEmpage(24);
		
		System.out.println(obj.getSsn());
		System.out.println(obj.getEmpname());
		System.out.println(obj.getEmpage());
	}
}
