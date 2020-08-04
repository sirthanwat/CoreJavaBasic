package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUse1 {

	public void writeData(String str) throws IOException
	{
		File f = new File("src/WriteFile.txt");
		FileWriter fwit = new FileWriter(f, true); //calling para constructor , which is not overiding 

		fwit.write(str); //writting 
		fwit.flush();//save the file
		fwit.close();//closing
		
	}
	public static void main(String[] args) throws IOException {
		FileWriterUse1 rf = new FileWriterUse1();
				rf.writeData("\n trying for somthing");
		}
}

//adv: if file is not created then it will creat automatically
//limit 1: overiting in existing data

//Solution is : BufferReader

