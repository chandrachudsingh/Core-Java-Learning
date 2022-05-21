import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrowsAndFinally 
{
	public static void main(String[] args)
	{
		try
		{
			Example();
		}
		
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		catch(NegativeArraySizeException e)
		{
			e.printStackTrace();
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		finally 
		{
			System.out.println("Yeah,All the Exceptions run correctly");
		}
	}
	
	public static void Example() throws NegativeArraySizeException, ArrayIndexOutOfBoundsException, ArithmeticException, InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
	
			System.out.println("Enter array size:");
			int n=sc.nextInt();
			
			int arr[]=new int[n];
			System.out.println("Enter array elements:");
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			System.out.println("Enter the position of the element to be divided:");
			int index=sc.nextInt();
			
			System.out.println("Enter the divisor:");
			int div=sc.nextInt();
			
			System.out.println("The result is: "+arr[index]/div);
	}
}
