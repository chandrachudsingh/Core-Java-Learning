import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_BufferedReader 
{
	public static void main(String[] args)
	{
		File F=new File("BWFile.txt");
		try 
		{
			FileReader Fr=new FileReader(F);
			BufferedReader Br=new BufferedReader(Fr);
			
			/*int text;
			while((text=Br.read())!=-1)
				System.out.print((char)text); */
			String text;
			while((text=Br.readLine())!=null)
				System.out.print(text);
			
			Br.close();
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
