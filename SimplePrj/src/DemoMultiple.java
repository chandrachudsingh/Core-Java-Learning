import java.util.Scanner;
public class DemoMultiple 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		switch(num%5)
		{
		case 0:
			System.out.print(num+" is divisible by 5");
			break;
		default:
			System.out.print(num+" is not divisible by 5");
		}
	}
}
