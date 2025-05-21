package FileHandlingPrograms;

import java.io.File;
import java.io.IOException;

public class Demo
{
     public static void main(String[] args)
    {
	    File file=new File("C:\\Desktop\\Java By Kiran Workspace\\Siddhi.txt");	
	    
	    try {
	          file.createNewFile();
	          System.out.println("File Created!!!!");
	    }
	    catch (IOException e) {
			System.out.println(e);
	    	
		}
	   
	    
	}
}
