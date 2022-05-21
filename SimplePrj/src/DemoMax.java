import java.util.Scanner;

public class DemoMax 
{
    public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
    	
    	System.out.println("Enter two numbers:");
    	int a=s.nextInt();
    	int b=s.nextInt();
    	
    	if(a>b)
    		System.out.print(a+" is greater than "+b);
    	else if(b>a)
    		System.out.print(b+" is greater than "+a);
    	else
    		System.out.print("Both the numbers are equal");
    }
}
