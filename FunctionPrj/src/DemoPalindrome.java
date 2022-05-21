import java.util.Scanner;

public class DemoPalindrome 
{
	public static int reverse(int num)
	{
		int revnum=0;
		for(int x=num;x>0;x/=10)
			revnum=(revnum*10)+x%10;
		return revnum;
	}
	public static boolean isPalin(int num)
	{
		return (reverse(num)==num);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n=sc.nextInt();
		
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number "+(i+1)+":");
			num[i]=sc.nextInt();
			if(isPalin(num[i]))
				System.out.print(num+" is Palindrome number");
			else
				System.out.print(num+" is not Palindrome number");
		}
	}
}
