import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile_FOS 
{
	public static void main(String[] args)
	{
		FileOutputStream outfile=null;
		byte b[]= {'H','e','l','l','o'};
		try {
			outfile=new FileOutputStream("Hello.txt");
			outfile.write(b);
			outfile.flush();       //clears the output stream
			outfile.close();
			
			System.out.println("File written successfully");
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
