package typicalprogram.FileDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import typicalprogram.Student;

public class StuInfoDemo {

	public static void main(String[] args) {
//		File f=new File("c:\\test\\studentinfo.txt");
		StuInfoDemo obj=new StuInfoDemo();
		List<StudentInfo> stuList=obj.readFromFile("c:\\test\\studentinfo.txt");
		
		//sort the arraylist
		Collections.sort(stuList);  //sorts the objects
			
//		File fr=new File("c:\\test\\stuinfoSorted.txt");	
			
		obj.write2File("c:\\test\\stuinfoSorted.txt", stuList)	;
		
	}
	
	List<StudentInfo> readFromFile(String fn){
		List<StudentInfo> stuList=new ArrayList<StudentInfo>();
		try {
			FileReader fin=new FileReader(fn);
			BufferedReader bin=new BufferedReader(fin);
			//first step: read info from file and store them to arraylist 
			String line;
			while((line=bin.readLine())!=null){
				String[] sInfo=line.split("[,]");
				StudentInfo s=new StudentInfo();
				s.setName(sInfo[0].trim());
				s.setMajor(sInfo[1].trim());
				s.setAge(Integer.parseInt(sInfo[2].trim()));
				s.setScore(Float.parseFloat(sInfo[3].trim()));
				
				stuList.add(s);
			}
			bin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stuList;
	}

	boolean write2File(String fn, List<StudentInfo> slist){
		//write stu info to a file
		try {
			FileWriter fout=new FileWriter(fn);
			
			StringBuilder sb=new StringBuilder();
			for (StudentInfo s : slist) {
				sb.append(s.getName()+", "+s.getMajor()+", "+s.getAge()+", "+s.getScore()+"\r\n");
			}
			
				
			System.out.println(sb.toString());
			System.out.println("written successfully");
			
			fout.write(sb.toString());
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return true;		
	}

}
