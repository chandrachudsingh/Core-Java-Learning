import java.util.Scanner;

public class DemoArrRevPrint 
{
	public static void main(String[] args)
	{
		try
		{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter "+n+" Elements");
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
		
			System.out.println("Revers Array elements are:");
			for(int i=n;i>=0;i--)
				System.out.println(arr[i]);	
		
		
			System.out.println("Revers Array elements are:");
			for(int i=n;i>=0;i--)
				System.out.println(arr[i]);	
		}
		catch(NegativeArraySizeException e)
		{	
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}		
	}
}
