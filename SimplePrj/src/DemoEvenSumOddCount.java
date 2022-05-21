import java.util.Scanner;

public class DemoEvenSumOddCount 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Terms:");
		int n=sc.nextInt();
	
		int sum=0,count=0;
		System.out.println("Enter "+n+" numbers");
		int num;
		for(int i=1;i<=n;i++)
		{
			num=sc.nextInt();
			if(num%2==0)
				sum+=num;
			else
				count++;
		}
		System.out.print("sum of even numbers="+sum+"\nCount of odd numbers is="+count);
	}
}
