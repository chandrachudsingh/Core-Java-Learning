import java.util.Scanner;

public class DemoFunctionOver 
{
	public static  int sumNo(int a,int b)
	{
		return a+b;
	}
	public static float sumNo(float a,float b)
	{
		return a+b;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 for additon of integers and 2 for float numbers:");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Enter two Integer numbers:");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.print("Sum="+sumNo(num1,num2));
			break;
		case 2:
			System.out.println("Enter two Float numbers:");
			float num3=sc.nextFloat();
			float num4=sc.nextFloat();
			System.out.print("Sum="+sumNo(num3,num4));
			break;
		default:
			System.out.print("Enter correct choice");
		}
	}
}
