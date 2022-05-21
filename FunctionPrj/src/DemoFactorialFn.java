import java.util.Scanner;

public class DemoFactorialFn 
{
	public static int factorial(int num)
	{
		int fact=1;
		for(;num>0;num--)
			fact*=num;
		return fact;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		
		System.out.print("Factorial of "+no+"="+factorial(no));
	}
}
