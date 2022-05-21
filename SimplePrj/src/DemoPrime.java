import java.util.Scanner;

public class DemoPrime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		boolean status=true;
		if(num>1)
		{
			if(num<4)
				status=true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					status=false;
					break;
				}
			}
		if(status)
			System.out.print(num+" is prime");
		else
			System.out.print(num+" is not prime");
		}
		
	}
}
