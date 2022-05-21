import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile 
{
	public static void main(String[] args)
	{
		File infile=new File("Hello.txt");
		File outfile=new File("BWFile.txt");
		
		try 
		{
			FileInputStream fis=new FileInputStream(infile);
			FileOutputStream fos=new FileOutputStream(outfile);
			
			int ch;
			while((ch=fis.read())!=-1)
			{
				fos.write((char)ch);
			}
			
			fis.close();
			fos.close();
			System.out.println("Operation successful");
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
