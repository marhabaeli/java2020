package lectureExample.Array.String;

public class StringExam2 {

	public static void main(String[] args) {
		StringExam2 obj=new StringExam2();
		byte[] a=obj.convert2ByteArray("Java");
//		for(int i=0;i<a.length;i++)
//			System.out.println(a[i]);
		for(byte v:a){
			System.out.print(v);
		}
		
		System.out.println();
		String st="Java ajayip bir dunya!";
		char[] ch1=new char[20];
		obj.grabSomeParts(st, 5, 11,ch1,0);
//		for(char v:ch1){
//			System.out.print(v);
//		}
		System.out.println(ch1);
				
		System.out.println(obj.swapLetter("java", 'j', 'k'));
		
	}
	
	byte[] convert2ByteArray(String s){
		return s.getBytes();
	}

	void grabSomeParts(String s, int b, int e,char[] ch, int dbegin){
		s.getChars(b,e,ch,dbegin);
	}
	
	String swapLetter(String s,char old, char yengi){
		return s.replace(old, yengi);
	}
}
