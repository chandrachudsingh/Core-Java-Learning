import java.util.Scanner;

public class DemoSumFun 
{
	public static  int sumofNo(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
	    System.out.print("Sum="+sumofNo(num1,num2));
	}
	
}
