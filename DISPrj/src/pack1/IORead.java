package pack1;

import java.io.DataInputStream;
import java.io.IOException;

public class IORead 
{
	public int readInt()
	{
		DataInputStream input=new DataInputStream(System.in);

		int a=0;
		
		try 
		{
			a=Integer.parseInt(input.readLine());
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			return a;
		}
	}
	public float readFLoat()
	{
		DataInputStream input=new DataInputStream(System.in);

		float b=0;
		try
		{
			b = Float.parseFloat(input.readLine());
		} 
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return b;
	}
	
	public String readString()
	{
		DataInputStream input=new DataInputStream(System.in);

		String str=null;
		try 
		{
			str = input.readLine();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return str;
	}
}
