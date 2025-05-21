package practiceQue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolder 
{
     public static void main(String[] args) 
    {
    	 
    	 try {
    		 File file1=new File("C:\\Desktop\\File Handling\\Nation\\Result");		
    		 file1.mkdir();
    		 System.out.println("File created");
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    	 }
	}
}
