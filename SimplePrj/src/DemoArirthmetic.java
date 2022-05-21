import java.util.Scanner;

public class DemoArirthmetic 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c = 0;
		System.out.println("Enter 1 for addition\n2 for subtraction\n3 for multipication\n4 for division\n5 for remainder");
		int x=sc.nextInt();
		
		switch(x)
		{
		    case 1:
		    	c=a+b;
		    	break;
		    case 2:
		    	c=a-b;
		    	break;
		    case 3:
		    	c=a*b;
		    	break;
		    case 4:
		    	c=a/b;
		    	break;
		    case 5:
		    	c=a%b;
		    	break;
		    default:
		    	System.out.println("Please enter a correct choice");
		}
		System.out.print("Result="+c);
	}
	
}
