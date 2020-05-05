package lectureExample.Array.String;

public class StringExam3 {
	public static void main(String[] args) {
		String s="Robert Rosar";
		StringExam3 obj=new StringExam3();
		
//		System.out.println(obj.getAbbrName(s));
		
		System.out.println(obj.delConsonant("Hello, have a good day!"));
		
		}
	
	
	String delConsonant(String s){
//		for(int i=0;i<s.length();i++){
//			char c=s.charAt(i);
//			if(c>='a' && c<='z' || c>='A' && c<='Z'){
//				String str=Character.toString(c);
//				if(!"AaEeIiOoUu".contains(str))
//					s.replace(str, "");
//			}
//		}
//		return s;
		
		
		String vowels="aeiouAEIOU,.:?; ";
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length();){
			if(!vowels.contains(sb.subSequence(i, i+1))){
				sb.replace(i, i+1, "");
				continue;
			}
			i++;
		}
//		System.out.println(sb.toString());
		return sb.toString();
	}
	
	
	
	String getAbbrName(String nm){ //nm=Robert Brett Rosar
		String[] nms=nm.split(" ");  //nms[0]=Robert, nms[1]=Brett, nms[2]=ROsar, length=3
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<nms.length-1;i++){
			sb.append(nms[i].substring(0,1)+".");
		}
		sb.append(nms[nms.length-1]);   //? nms[2]
		
		return sb.toString();
	}
	}