package lectureExample.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> aList=new ArrayList<String>();
		aList.add("merhaba");
		aList.add("Aygul");
		aList.add("Shemshinur");
		aList.add("mahire");
		aList.add("amine");
		aList.add("Ihtibar");
		aList.add("Hawagul");
		aList.add("Raziye");
		aList.add("Sanuber");
		
		System.out.println(aList);
		if(!aList.contains("Ramadan"))
			aList.add("Ramadan");
		
		aList.add(3,"Gulnaz");
		System.out.println(aList);
		aList.remove("Shemshinur");
		System.out.println(aList);
		System.out.println(aList.get(3));
		System.out.println(aList.size());
		
		for(String s:aList){
			System.out.print(s.toUpperCase()+" ");
		}
		System.out.println();
		Collections.sort(aList);
		System.out.print(aList+" ");
		
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("A");
		hashSet.add("A");
		System.out.println(hashSet+" "+hashSet.size());
		
	}

}
