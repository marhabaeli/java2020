package lectureExample.OOP.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class JavaIODemo {

	public static void main(String[] args) {
		File file=new File("c:\\Users\\Ssuba\\test.docx");
		
		XWPFDocument document = new XWPFDocument();
		XWPFParagraph paragraph = document.createParagraph();
		try {
			FileOutputStream out=new FileOutputStream(file);
//			XWPFRun run =paragraph.createRun();
//			run.setText("I am a hero\r\n!");
			document.write(out);
			out.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
//		try{
////			if(!file.exists())			
////				file.createNewFile();
//				boolean fvar = file.createNewFile();
//			     if (fvar){
//			          System.out.println("File has been created successfully");
//			     }
//			     else{
//			          System.out.println("File already present at the specified location");
//			     }
//			} catch (IOException e) {
//				e.printStackTrace();
////				System.out.println("file is not created");
//			} 
	}

}
