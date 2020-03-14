package assignment.method;

public class MethodAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I Love java! Really? I don't think so... But I can count these numbers 23423	43, Ye!!!?";
		System.out.println("Upper cnt="+countUpLetter(s));
		System.out.println("Lower cnt="+countLowLetter(s));
		System.out.println("Number cnt="+ countNumbers(s));
		System.out.println("Punc cnt="+countPunc(s));

	}
	
	static int countUpLetter(String s){
		int cnt=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				cnt++;
		}
		return cnt;
	}
	
	static int countLowLetter(String s){
		int cnt=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				cnt++;
		}
		return cnt;
	}
	
	static int countNumbers(String s){
		int cnt=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				cnt++;
		}
		return cnt;
	}
	
	static int countPunc(String s){
		int cnt=0;
		for(int i=0;i<s.length();i++){
			if(",.?:;!\"\'".contains(s.substring(i,i+1)))
				cnt++;
		}
		return cnt;
	}

}
