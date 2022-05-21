import java.io.File;
import java.io.IOException;

public class CreateFile 
{
	public static void main(String[] args)
	{
		File F=new File("Hello.txt");
		try {
			if(F.createNewFile())
				System.out.println("File created successfully");
			else 
				System.out.println("File creation failed");
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}
}
