package pack1;

public class Functions 
{
	public static int sum(int a,int b)
	{
		return a+b;
	}
	
	public static boolean isArm(int num)
	{
		int count=0;
		for(int x=num;x>0;x/=10)
			count++;
		int sum=0;
		for(int x=num;x>0;x/=10)
			sum+=Math.pow(x%10, count);
		
		if(sum==num)
			return true;
		else
			return false;
	}
	
	public static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("Numbers after swapping:\na="+a+"\nb="+b);
	}
	
	public boolean isPrime(int num)
	{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
					return false;
			}
			return true;
	}
}
