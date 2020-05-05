package lectureExample.OOP.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) {
		File file = new File("C:/Users/Ssuba/desktop/test.txt");
		
	    FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			  
			  String st;
			  while ((st = br.readLine()) != null)
			    System.out.println(st);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	  
	  	


	}

}
