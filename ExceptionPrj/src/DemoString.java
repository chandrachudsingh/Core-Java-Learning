import java.io.DataInputStream;
import java.io.IOException;

public class DemoString 
{
	public static void main(String[] args) throws IOException
	{
		DataInputStream input=new DataInputStream(System.in);
	
		System.out.println("Enter your name");
		String name = null;
		name = input.readLine();
		
		System.out.print("Hello,"+name);
	}
}
