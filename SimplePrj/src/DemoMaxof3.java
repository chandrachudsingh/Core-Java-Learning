import java.util.Scanner;

public class DemoMaxof3 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b&&b>c)
			System.out.print(a+" is the largest of all");
		else if(b>c)
			System.out.print(b+" is the largest of all");
		else
			System.out.print(c+" is the largest of all");
	}
}
