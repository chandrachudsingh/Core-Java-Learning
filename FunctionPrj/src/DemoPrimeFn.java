import java.util.Scanner;

public class DemoPrimeFn 
{
	public static boolean isPrime(int num)
	{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
					return false;
			}
			return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(num>1)
		{
			if(isPrime(num))
				System.out.print(num+" is prime");
			else
				System.out.print(num+" is not prime");
		}
		else
			System.out.println(num+" must be greater than 1");
	}
}
