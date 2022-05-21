import java.io.DataInputStream;
import java.io.IOException;

public class DemoInt 
{
	public static void main(String[] args)
	{
		DataInputStream input=new DataInputStream(System.in);
		
		System.out.println("Enter your age");
		int age = 0;
		try 
		{
			age = Integer.parseInt(input.readLine());
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
				
		System.out.print("Your age is "+age);
	}
}
