import java.util.Scanner;

public class PalindromeFun 
{
	public static boolean isPalin(int num)
	{
		int revnum=0;
		for(int x=num;x>0;x/=10)
			revnum=(revnum*10)+(x%10);
		
		if(revnum==num)
			return true;
		else 
			return false;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(isPalin(num))
			System.out.println(num+" is Palindrome");
		else 
			System.out.println(num+" is not Palindrome");
	}
}
