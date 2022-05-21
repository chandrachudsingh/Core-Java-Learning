import java.util.Scanner;

public class DivideByZero 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Division of two numbers="+a/b);
	}
}
