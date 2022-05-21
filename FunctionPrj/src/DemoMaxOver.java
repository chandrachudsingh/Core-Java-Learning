import java.util.Scanner;

public class DemoMaxOver 
{
	public static  int maxNo(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static int maxNo(int a,int b,int c)
	{
		if(a>b&&a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 2 for Maximum of Two numbers and 3 for three numbers:");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 2:
			System.out.println("Enter 2 numbers:");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.print(maxNo(num1,num2)+" is the greatest number");
			break;
		case 3:
			System.out.println("Enter 3 numbers:");
			int num3=sc.nextInt();
			int num4=sc.nextInt();
			int num5=sc.nextInt();
			System.out.print(maxNo(num3,num4,num5)+" is the greatest number");
			break;
		default:
			System.out.print("Enter correct choice");
		}
	}
}
