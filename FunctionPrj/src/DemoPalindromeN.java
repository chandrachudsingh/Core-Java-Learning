import java.util.Scanner;

public class DemoPalindromeN
{
	public static boolean isPalin(int num)
	{
		int revnum=0;
		for(int x=num;x>0;x/=10)
			revnum=(revnum*10)+x%10;
		
		if(revnum==num)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(isPalin(arr[i]))
				System.out.println(arr[i]+" is Palindrome number");
			else
				System.out.println(arr[i]+" is not Palindrome number");
		}
	}
}
