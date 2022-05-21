import java.util.Scanner;

public class StringRead 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String name=sc.next();
		
		System.out.println("Enter the position of the character to show:");
		int pos=sc.nextInt();
		
		try
		{
			System.out.println("The character you want to see is: "+name.charAt(pos-1));
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}
