package pack1;

import java.util.Scanner;
public class DemoFunctions 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers to add:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Functions.sum(a,b);
		
		System.out.println("Enter a number to check Armstrong:");
		int num=sc.nextInt();
		Functions.isArm(num);
		
		System.out.println("Enter two numbers to swap:");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		Functions.swap(a1,b1);
		
		System.out.println("Enter a number to check for prime:");
		int num1=sc.nextInt();
		Functions F=new Functions();
		F.isPrime(num1);
	}
}
