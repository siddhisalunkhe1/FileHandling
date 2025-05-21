package practiceQue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class CopyFileData 
{
      public static void main(String[] args)
    {
	    File sourceFile = new File("C:\\\\Desktop\\\\File Handling\\\\Nation\\\\State\\\\Maharashtra.txt");
	    
	    File destinFile = new File("C:\\\\Desktop\\\\File Handling\\\\Nation\\\\State\\\\myState.txt");
	    
	    try (   //this is the try with resources block which ensures that resources are automatically closed after use
	    	FileReader fr=new FileReader(sourceFile);//FileReader reads characters from the source file
	    	BufferedReader br=new BufferedReader(fr);//BufferedReader adds buffering for efficient reading
	    	FileWriter fw=new FileWriter(destinFile);//FileWriter writes characters to the destination file
	    	BufferedWriter bw = new BufferedWriter(fw);//BufferedWriter adds buffering for efficient writing    	
	      ){
	    	String line;
	    	while((line = br.readLine()) != null)//reads each line from the source file until no more lines are left
	    	{                                    // br.readLine() returns null when end of file is reached
	    		bw.write(line);//writes line into the destination file
	    		bw.newLine();//adds a new line(line break) after each line written
	    		
	    	}
	    }catch(IOException e)
	    {
	    	System.out.println(e);
	    }
	}
}
