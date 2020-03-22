package lectureExample.Array.String;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringExam {
	Date date=new Date();

	public static void main(String[] args) {
		StringExam obj1=new StringExam();
		char ch=obj1.getCharInString("Java Example!", 5);
//		System.out.println(ch);
//		String string1="Java";
//		String string2="Tesmiken?";
//		System.out.println(obj1.combineString("AB", "CD"));
//		System.out.println(obj1.combineString(string1, string2));
//		string1="PHP Exercises and Python Exercises";
//		string2="and";
//		System.out.println(obj1.isContains(string1,string2));
//		System.out.println(obj1.isEndedWith("Java exercises", "se"));
//		System.out.println(obj1.isEndedWith("Java exercise", "se"));
//		System.out.println(obj1.isEqual("Merhaba", "marhaba"));
		obj1.showCurrentCalendar();
		
		
	}
	
	char getCharInString(String s, int n){
		return s.charAt(n);
	}
	
	String combineString(String s1, String s2){
		return s1.concat(s2);
	}
	
	boolean isEqual(String s1, String s2){
		return s1.equalsIgnoreCase(s2);
	}

	boolean isContains(String s1,String s2){
		return s1.contains(s2);
	}
	
	boolean isEndedWith(String s1, String s2){
		return s1.endsWith(s2);
	}
	
	void showCurrentCalendar(){
		Calendar calendar=Calendar.getInstance();
//		System.out.println(calendar);
//		Date date=new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(dateFormat.format(date));
//		System.out.println(dateFormat.for);

	}
}
