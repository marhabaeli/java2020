package lectureExample.OOP.IO;

import java.io.File;

public class FileDemo {
	 public static void main(String[] args) {
	      File f = null;
	      String[] strs = {"test1.txt", "test2.txt"};
	      try {
	         for(String s:strs ) {
	            f = new File(s); // create new file	                      
	            String a = f.getAbsolutePath(); // find the absolute path
	            System.out.print(a);  // prints absolute path
	         } 
	      } catch (Exception e) {
	            e.printStackTrace();
	      }
	   }
}
