import java.util.Scanner;

public class DemoFactorialOfN 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Terms:");
		int n=sc.nextInt();
		
		System.out.println("Enter "+n+" elements");
		int num = 0;
		for(int i=1;i<=n;i++)
		{	
			num=sc.nextInt();
			int fact=1;
			for(;num>0;num--)
				fact*=num;
			System.out.println("Factorial of number="+fact);
		}
	}
}
