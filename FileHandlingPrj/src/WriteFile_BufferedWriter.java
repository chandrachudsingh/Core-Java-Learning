import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile_BufferedWriter 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		File F=new File("BWFile.txt");
		try 
		{
			FileWriter Fw=new FileWriter(F);
			BufferedWriter Bw=new BufferedWriter(Fw);
			
			System.out.println("Enter data to enter into the file :");
			String text=sc.nextLine();
			
			Bw.write(text);
			Bw.close();
			System.out.println("File written successfully");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
