import java.io.File;
import java.util.Scanner;

public class DeleteFile 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the file name to be deleted : ");
		String fname=sc.next();
		File F=new File(fname);
		
		if(F.exists())
		{
			if(F.delete())
				System.out.println("File deleted successfully");
			else 
				System.out.println("Operation failed");
		}
		else 
			System.out.println("Error! File doesn't exists");
	}

}
