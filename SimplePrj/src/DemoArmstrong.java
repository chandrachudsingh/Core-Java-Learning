import java.util.Scanner;

public class DemoArmstrong 	
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int x=num,count=0;
		for(;x>0;count++,x/=10);
		
		int sum=0;
		for(x=num;x>0;x/=10)
			sum+=Math.pow(x%10, count);
		
		if (sum==num)
			System.out.print(sum+" is an armstrong no.");
		else
			System.out.print(sum+" is not an armstrong no.");
	}
}
