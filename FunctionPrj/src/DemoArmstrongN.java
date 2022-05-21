import java.util.Scanner;

public class DemoArmstrongN 
{
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
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n=sc.nextInt();
		
		int num=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter number "+i+":");
			num=sc.nextInt();
			
			if(isArm(num))
				System.out.println(num+" is Armstrong");
			else
				System.out.println(num+" is not Armstrong");
		}
	}
}
