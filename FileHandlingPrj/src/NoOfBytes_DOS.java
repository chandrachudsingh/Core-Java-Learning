//Program to determine number of bytes written to file using DataOutputStream

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NoOfBytes_DOS 
{
	public static void main(String[] args)
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream("Hello.txt");
			DataOutputStream Dos=new  DataOutputStream(fos);
			
			Dos.writeBytes("hello brother");
			System.out.println("Bytes Written : "+Dos.size());
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
