import java.util.Scanner;

public class DemoLower 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character in upper case");
		char ch=sc.next().charAt(0);
		
		ch=(char)(ch+32);
		System.out.print("Lower case of the charater is "+ch);
	}
}
