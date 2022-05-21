import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 
{
	public static void main(String[] args)
	{
		File infile=new File("Hello.txt");
		File outfile=new File("BWFile.txt");
		
		try 
		{
			FileReader Fr=new FileReader(infile);
			FileWriter Fw=new FileWriter(outfile);
			
			int ch;
			while((ch=Fr.read())!=-1)
			{
				Fw.write((char)ch);
			}
			
			Fr.close();
			Fw.close();
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
