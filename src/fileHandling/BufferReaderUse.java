package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderUse {

	public void readData() throws IOException {
		
		File f = new File("src/Untitled.txt");
		FileReader fred = new FileReader(f);
		
		BufferedReader bufR = new BufferedReader(fred);
		String str = bufR.readLine();
		while (str != null) {
			System.out.println(str);
			str = bufR.readLine();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferReaderUse rf = new BufferReaderUse();
		rf.readData();
	}
}

// limit 1: reading one char at a time
// limit 2: we are converting data into char
// Solution is : BufferReader
