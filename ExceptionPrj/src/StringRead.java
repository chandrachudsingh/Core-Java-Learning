import java.util.Scanner;

public class StringRead 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name=sc.next();
		
		System.out.println("Enter the position of the character to show:");
		int index=sc.nextInt();
		try
		{
			System.out.println("The character you chose is:"+name.charAt(index-1));
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
