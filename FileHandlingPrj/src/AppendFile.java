import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFile 
{
	public static void main(String[] args)
	{
		String fpath="C:\\Users\\Abhi\\OneDrive\\Documents\\Backup\\Eclipse Workspace\\FileHandlingPrj\\Hello.txt";
		try {
			FileOutputStream outfile=new FileOutputStream(fpath,true);
			String text=" Welcome here.";
			outfile.write(text.getBytes());
			outfile.flush();       //clears the output stream
			outfile.close();
			
			System.out.println("File appended successfully");
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
