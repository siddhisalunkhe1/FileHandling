package practiceQue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyExample
{
	public static void main(String[] args) 
    {
		Path source = Paths.get("C:\\Desktop\\File Handling\\Nation\\Flower\\lotus.txt");
		
		Path Destination = Paths.get("C:\\Desktop\\File Handling\\Nation\\Result\\lotus.txt");
    	 
    	 try {
    		Files.copy(source, Destination); 
    		System.out.println("File copied Successively!");
    		
    	 }
    	 catch(IOException e)
    	 {
    		 System.out.println(e);
    	 }
	}
}
