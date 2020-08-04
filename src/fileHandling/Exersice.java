package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//read from 2 files and write in 3rd files
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exersice {

	public String readData() throws IOException {
		String s1 = null;
		File f = new File("src/Untitled.txt");
		FileReader fred = new FileReader(f);
		BufferedReader br = new BufferedReader(fred);
		String s = br.readLine();
		while(s!=null)
		{
		System.out.println(s);
		s = br.readLine();
		s1= s;

		}
		return s1;
	}

	public int readData1() throws IOException {
		int i1;
		File f1 = new File("src/WriteFile.txt");
		FileReader fred1 = new FileReader(f1);
		i1 = fred1.read();
		while (i1 != -1) {
			System.out.print((char) i1);
			i1 = fred1.read();
		}
		return i1;
	}
	
	public void writeData(String str, int str1) throws IOException
	{
		File f = new File("src/Exersice.txt");
		FileWriter fwit = new FileWriter(f, true); //calling para constructor , which is not overiding 
		BufferedWriter bwrt = new BufferedWriter(fwit);
        bwrt.newLine();
		System.out.print("****" +str1);
        bwrt.write(str); 
        bwrt.write((char)str1);  
        bwrt.flush();//save the file
        bwrt.close();//closing	
		FileReader fred1 = new FileReader(f);
		int i1 = fred1.read();
		while (i1 != -1) {
			System.out.print((char) i1);
			i1 = fred1.read();
		}
	}
	public void writeData1(String str) throws IOException
	{
		File f = new File("src/Exersice.txt");
		FileWriter fwit = new FileWriter(f, true); //calling para constructor , which is not overiding 
		BufferedWriter bwrt = new BufferedWriter(fwit);
        bwrt.newLine();
		System.out.println("str..." +str);
        bwrt.write(str); 
        bwrt.flush();//save the file
        bwrt.close();//closing	
		FileReader fred1 = new FileReader(f);
		BufferedReader br = new BufferedReader(fred1);
		String s = br.readLine();
		while(s!=null)
		{
		System.out.println(s);
		s = br.readLine();
		}		
	}

	public static void main(String[] args) throws IOException {
		Exersice rf = new Exersice();
		String a = rf.readData();
		//int b = rf.readData1();
		//rf.writeData(a, b);
		rf.writeData1(a);
	}
}

// limit 1: reading one char at a time
// limit 2: we are converting data into char
// Solution is : BufferReader
