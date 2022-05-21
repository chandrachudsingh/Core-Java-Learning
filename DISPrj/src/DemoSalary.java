import java.io.DataInputStream;
import java.io.IOException;

public class DemoSalary 
{
	public static void main(String[] args)
	{
		DataInputStream input=new DataInputStream(System.in);
		
		System.out.println("Enter your Salary");
		float sal = 0;
		
			try 
			{
				sal =Float.parseFloat(input.readLine());
			} 
			catch (NumberFormatException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{	
				e.printStackTrace();
			} 
		
				
		System.out.print("Your Salary is "+sal);
	}
}
