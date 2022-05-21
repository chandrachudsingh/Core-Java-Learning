import java.util.Scanner;

public class DemoReadPositivePrime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Terms:");
		int n=sc.nextInt();
		
		System.out.println("Enter "+n+" numbers");
		outer:for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			if(num<2)
				break;
			for(int j=2;j<n;j++)
			{
				if(num%j==0)
					break outer;
			}
		}
	}
}
