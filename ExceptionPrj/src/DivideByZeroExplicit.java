import java.util.Scanner;

public class DivideByZeroExplicit 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			if(b==0)
				throw new ArithmeticException("Second argument must be non zero...");
			System.out.println("Division of two numbers="+a/b);
		}
		/*catch(ArithmeticException e)
		{
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		catch(Exception e)
		{
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}
}
