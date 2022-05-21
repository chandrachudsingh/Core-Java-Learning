import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLineByLine 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name :");
		String fname=sc.next();
		
		FileInputStream fis=new FileInputStream(fname);
		Scanner sc1=new Scanner(fis);
		
		System.out.println("The File data is:\n");
		while(sc1.hasNext())
		{
			System.out.println(sc1.nextLine());
		}
	}
}
