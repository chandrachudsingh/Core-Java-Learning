import java.io.DataInputStream;
import java.io.IOException;

public class DemoInt 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		DataInputStream input=new DataInputStream(System.in);
		
		System.out.println("Enter your age");
		int age = 0;
		
		age = Integer.parseInt(input.readLine());
				
		System.out.print("Your age is "+age);
	}
}
