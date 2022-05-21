//program to read text from file from a specified index or skipping byte using FileInputStream

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromIndex
{
	public static void main(String[] args) 
	{   
		File F = new File("Hello.txt");
		try
		{
			FileInputStream fin = new FileInputStream(F);
			int ch;

			System.out.println("File's content after 10 bytes is: ");
			fin.skip(10);                                             //to skip the bytes
			while( (ch = fin.read()) != -1 )
				System.out.print((char) ch);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("FileNotFoundException : " + ex.toString());
		}
		catch(IOException ioe)
		{
			System.out.println("IOException : " + ioe.toString());
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.toString());
		}
	}
}