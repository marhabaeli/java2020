package lectureExample.OOP.IO;

import java.io.File;

public class DirList {
	public static void main(String[] args) {
	      File file = null;
	      String[] paths;
	  
	      try {      
	        file = new File("/tmp");    // create new file object
            paths = file.list(); 	    // array of files and directory
	         
            for(String path:paths) {  // for each name in the path array
	            System.out.println(path); // prints filename and directory name
	         }
	      } catch (Exception e) {	         
	         e.printStackTrace();// if any error occurs
	      }
	 }
}
