package typicalprogram.FileDemo;

public class StudentInfo implements Comparable<StudentInfo>{
	private String name;
	private String major;
	private int age;
	private float score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public int compareTo(StudentInfo o) {
		if (age>o.getAge())
			return 1;
		else if(age==o.getAge())
			return 0;
		else {
			return -1;
		}
//		return name.compareTo(o.name);
		
	}
}
