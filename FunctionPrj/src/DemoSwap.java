import java.util.Scanner;

public class DemoSwap 
{
	public static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("Numbers after swapping:\na="+a+"\nb="+b);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two numbers to swap:\na=");
		int num1=sc.nextInt();
		System.out.print("b=");
		int num2 = sc.nextInt();
		
		swap(num1,num2);
	}
}
