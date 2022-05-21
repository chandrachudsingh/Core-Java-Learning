import java.util.Scanner;

public class ReadPrime 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of terms:");
		int n=sc.nextInt();
		
		System.out.println("Enter the numbers:");
		outer:for(int i=1;i<=n;i++)
		{
			int num=sc.nextInt();
			
			if(num<2)
				break;
			for(int j=2;j<=num/2;j++)
			{
				if(num%2==0)
					break outer;
			}
		}
	}
}
