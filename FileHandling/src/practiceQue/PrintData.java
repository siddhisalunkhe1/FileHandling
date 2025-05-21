package practiceQue;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PrintData
{
    public static void main(String[] args)
    {
	      	try {
				FileReader f1=new FileReader("C:\\Desktop\\File Handling\\Nation\\State\\rajasthan.txt");
				
				while(true)
				{
					System.out.println();
				}
				
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
	}
}
