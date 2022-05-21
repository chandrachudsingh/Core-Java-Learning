import java.io.File;
import java.util.Scanner;

public class FileSizeAndPath 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of the file to get the size and path :");
		String fname=sc.next();
		
		File F=new File(fname);
		System.out.println("File path : "+F.getAbsolutePath());
		System.out.println("File size : "+F.length());         //in bytes
	}
}
