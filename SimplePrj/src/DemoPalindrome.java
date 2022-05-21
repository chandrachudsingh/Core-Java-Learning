import java.util.Scanner;

public class DemoPalindrome 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int sum=0;
		for(int x=num;x>0;x/=10)
			sum=(sum*10)+(x%10);
		
		if(num==sum)
			System.out.print(sum+" is palidrome");
		else
			System.out.print(num+" is not plaindrome");
	}
}
