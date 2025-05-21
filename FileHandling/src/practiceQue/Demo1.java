package practiceQue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1
{
	 public static void main(String[] args)
	    {
		    File file1=new File("C:\\Desktop\\File Handling\\Nation\\State\\Maharashtra.txt");	
		    File file2=new File("C:\\Desktop\\File Handling\\Nation\\State\\goa.txt");	
		    File file3=new File("C:\\Desktop\\File Handling\\Nation\\State\\rajasthan.txt");	
		    
		    File file4 = new File("C:\\Desktop\\File Handling\\Nation\\Flower\\rose.txt");
		    File file5 = new File("C:\\Desktop\\File Handling\\Nation\\Flower\\lotus.txt");
		    File file6 = new File("C:\\Desktop\\File Handling\\Nation\\Flower\\lilly.txt");
		    
		    try {
//		    	  file.mkdir();
//		    	  System.out.println("Folder created");
		    	
//		    	  file2.mkdir();
//		    	  System.out.println("Folder created");
		    	
//		          file.createNewFile();
//		          System.out.println("File Created!!!!");
		    	
//		    	  FileWriter f1=new FileWriter(file);
//		    	  String capital="Capital of Maharashtra is Mumbai";
//		    	  f1.write(capital);
//		    	  f1.flush();
//		    	  f1.close();
//		    	  System.out.println("File Writting done......");
//		    	  
//		    	  FileWriter f2=new FileWriter(file);
//		    	  String capital2="Capital of Goa is Panaji";
//		    	  f1.write(capital2);
//		    	  f1.flush();
//		    	  f1.close();
//		    	  System.out.println("File Writting done......");
//		    	  
//		    	  FileWriter f3=new FileWriter(file);
//		    	  String capital3="Capital of Rajasthan is Jaipur";
//		    	  f1.write(capital3);
//		    	  f1.flush();
//		    	  f1.close();
//		    	  System.out.println("File Writting done......");
		    	  
		    	FileWriter f4=new FileWriter(file4);
		    	  String color="Color of Rose is White";
		    	  f4.write(color);
		    	  f4.flush();
		    	  f4.close();
		    	  System.out.println("File Writting done......");
		    	  
		    	  FileWriter f5=new FileWriter(file5);
		    	  String color1="Color of lotus is pink";
		    	  f5.write(color1);
		    	  f5.flush();
		    	  f5.close();
		    	  System.out.println("File Writting done......");
		    	  
		    	  FileWriter f6=new FileWriter(file6);
		    	  String color2="Color of Lilly is White";
		    	  f6.write(color2);
		    	  f6.flush();
		    	  f6.close();
		    	  System.out.println("File Writting done......");
		    	  
		    	
		    }
		    catch (Exception e) {
				System.out.println(e);
		    	
			}
		   
		    
		}
}
