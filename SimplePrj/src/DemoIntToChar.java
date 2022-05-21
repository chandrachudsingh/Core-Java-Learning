import java.util.Scanner;

public class DemoIntToChar 
{
	public static void main(String[] args)
	{
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a integer value");
         
         int n=sc.nextInt();
         System.out.print("Char value of the integer="+(char)n);
	}
}
