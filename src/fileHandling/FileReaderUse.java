package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUse {

	public void readData() throws IOException
	{
		File f = new File("src/Untitled.txt");
		FileReader fred = new FileReader(f);
		int i = fred.read();
		while (i != -1) {
			//System.out.println(i); in ASCII its printing 
			System.out.print((char)i);
			i = fred.read();
		}
	}
	public static void main(String[] args) throws IOException {
		FileReaderUse rf = new FileReaderUse();
				rf.readData();
		}
}

//limit 1: reading one char at a time
//limit 2: we are converting data into char 
//Solution is : BufferReader

