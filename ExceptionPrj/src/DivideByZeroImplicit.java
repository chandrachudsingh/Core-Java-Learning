import java.util.Scanner;

public class DivideByZeroImplicit 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			System.out.println("Division of two numbers="+a/b);
		}
		/*catch(ArithmeticException e)             //Derived Exception
		{
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		catch(Exception e)                        //Base Exception 
		{
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		
		
	}
}
