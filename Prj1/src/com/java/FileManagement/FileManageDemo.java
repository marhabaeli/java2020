package com.java.FileManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FileManageDemo {

	public static void main(String[] args) {
		FileManageDemo obj=new FileManageDemo();
		String fname=System.getProperty("user.dir")+"\\students.txt";
		List<StudentInfo> sList=new ArrayList<StudentInfo>();
		sList=obj.readFromFile(fname);
		
		sList.sort(new Comparator<StudentInfo>(){

			@Override
			public int compare(StudentInfo o1, StudentInfo o2) {
				return o1.getName().compareTo(o2.getName());
			}			
		});
		
		String desFile=System.getProperty("user.dir")+"\\studentResult.txt";
		if(obj.write2File(desFile, sList))
			System.out.println("written processed successfully!");
		else
			System.out.println("something went wrong, written process fail!");

	}
	
	List<StudentInfo> readFromFile(String fn){
		List<StudentInfo> studentList=new ArrayList<StudentInfo>();
		FileReader fin;
		try {
			fin = new FileReader(fn);
			BufferedReader bin=new BufferedReader(fin);
			String line;
			while((line=bin.readLine())!=null){
				String[] tmp=line.split("[,]");
				StudentInfo st=new StudentInfo();
				st.setName(tmp[0].trim());
				st.setMajor(tmp[1].trim());
				st.setAge(Integer.parseInt(tmp[2].trim()));
				st.setScore(Float.parseFloat(tmp[3].trim()));
				
				studentList.add(st);
			}
			fin.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}catch ( IOException e){
			e.printStackTrace();
		}
		return studentList;
	}

	boolean write2File(String fn, List<StudentInfo> studentList){
		StringBuilder sBuilder=new StringBuilder();
		for(int i=0;i<studentList.size();i++){
			StudentInfo s=studentList.get(i);
			sBuilder.append(s.getName()+", "+s.getMajor()+", "+s.getAge()+", "+s.getScore()+"\r\n");
		}
		
		FileWriter fout;
		try {
			fout = new FileWriter(fn);
			BufferedWriter bout=new BufferedWriter(fout);
			System.out.println(sBuilder.toString());
			bout.write(sBuilder.toString());
			bout.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
