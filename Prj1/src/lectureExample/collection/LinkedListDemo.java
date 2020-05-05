package lectureExample.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> lList=new LinkedList<>();
		lList.add("A");
		lList.add("B");
		lList.add("C");
		lList.add("A");
		System.out.println(lList);
		
		ListIterator<String> it=lList.listIterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
