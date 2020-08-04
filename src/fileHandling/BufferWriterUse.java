package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterUse {

	public void writeData(String str) throws IOException
	{
		File f = new File("src/WriteFile.txt");
		FileWriter fwit = new FileWriter(f, true); //calling para constructor , which is not overiding 
        BufferedWriter bwrt = new BufferedWriter(fwit);
        bwrt.newLine();
        bwrt.write(str); //writting 
        bwrt.flush();//save the file
        bwrt.close();//closing
		
	}
	public static void main(String[] args) throws IOException {
		BufferWriterUse rf = new BufferWriterUse();
				rf.writeData("trying for somthing");
		}
}

//adv: if file is not created then it will creat automatically
//limit 1: overiting in existing data

//Solution is : BufferReader

