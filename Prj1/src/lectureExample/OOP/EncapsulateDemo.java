package lectureExample.OOP;

public class EncapsulateDemo {
	private int ssn;
	private String empname;
	private int empage;
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		if(empage<20 || empage>60){
			System.out.println("invalid age");
			return;
		}
		this.empage = empage;
	}

	
}
