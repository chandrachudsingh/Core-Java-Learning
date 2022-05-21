import java.io.File;
import java.util.Date;

//Java program to get the last modification date and time of a file


public class LastModifiedDetails 
{
	public static void main(String[] args)
	{
		File F=new File("Hello.txt");
		long lastModified = F.lastModified();
		System.out.println("File Last modified : "+new Date(lastModified));
	}
}
