import java.util.Scanner;

public class DemoCalculateNonPrime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Terms:");
		int n=sc.nextInt();
		
		int count=0;
		System.out.println("Enter "+n+" numbers");
		int num;
		for(int i=1;i<=n;i++)
		{
			num=sc.nextInt();
			if(num>1)
			{
				for(int j=2;i<num/2;j++)
				{
					if(num%j==0)
					{
						count++;
						break;
					}
				}
			}
		}
		System.out.print("No. of Non-prime terms="+count);
	}
}
