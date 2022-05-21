import java.util.Scanner;

public class DemoFactorial 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
       
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			//int x=arr[i];
			int fact=1;
			
			//for(;x>1;fact*=x,x--);
			for(int j=arr[i];j>=1;j--)
				fact*=j;
			System.out.println("factorial of "+arr[i]+"="+fact);
		}
	}

}
