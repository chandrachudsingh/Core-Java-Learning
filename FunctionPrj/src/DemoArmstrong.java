import java.util.Scanner;

public class DemoArmstrong 
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
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(isArm(num))
			System.out.print(num+" is Armstrong number");
		else
			System.out.print(num+" is not Armstrong number");
	}
}
