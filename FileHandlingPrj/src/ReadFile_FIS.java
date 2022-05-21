import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile_FIS 
{
	public static void main(String[] args)
	{
		FileInputStream infile=null;
		try 
		{
			infile=new FileInputStream("Hello.txt");
			int b;
			while((b=infile.read())!=-1)
				System.out.print((char)b);
			
			infile.close();
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
