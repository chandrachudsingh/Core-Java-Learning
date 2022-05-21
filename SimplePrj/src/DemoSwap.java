import java.util.Scanner;

public class DemoSwap 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("Values after swapping:\na="+a+"\nb="+b);
	}

}
