package lectureExample.OOP.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		String mycontent = "This String would be written to the specified File";
		File file = new File("C:/Users/Ssuba/desktop/test.txt"); 

		try {
			if (!file.exists()) {
				    file.createNewFile();
			  }

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(mycontent);
			System.out.println("File written Successfully\r\n");
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}


	}

}
