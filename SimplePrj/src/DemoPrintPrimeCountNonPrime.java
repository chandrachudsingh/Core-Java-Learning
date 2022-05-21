import java.util.Scanner;

public class DemoPrintPrimeCountNonPrime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Terms:");
		int n=sc.nextInt();
		
		int count=0;
		System.out.println("Enter "+n+" numbers");
		outer:for(int i=1;i<=n;i++)
		{
			int num=sc.nextInt();
			if(num<=1)
				continue;
			for(int j=2;j<=num/2;j++)
			{
				if(num%j==0)
				{
					count++;
					continue outer;
				}
			}
			System.out.println(num+" is prime");
		}
		System.out.print("No. of non-prime numbers="+count);
	}
}
