package lectureExample.OOP.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo1 {

	public static void main(String[] args) {
		 // Accept a string 
        String str = "File Handling in Java using FileWriter and FileReader";
  
        // attach a file to FileWriter 
        FileWriter fw;
		try {
			File f=new File("c:\\tmp\\output.txt");
			fw = new FileWriter(f);
			 // read character wise from string and write 
	        // into FileWriter 
//	        for (int i = 0; i < str.length(); i++)
	            fw.write(str);
	        System.out.println();
	  
	        System.out.println(f.getAbsolutePath());
	        System.out.println("Writing successful");
	        //close the file 
	        fw.close();
	        
	        System.out.println("\r\n============= read from file ===========\r\n");
	        FileReader fr=new FileReader(f);
	        char[] ch=new char[500];
	        fr.read(ch);
	        for(char c: ch){
	        	System.out.print(c);
	        }
	       

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
       

	}

}
