import java.util.Scanner;

public class DemoSplitEveOdd 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
	
		int arr[]=new int[n];
		int count=0;
		System.out.println("Enter "+arr.length+" elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		boolean status[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{	
				status[i]=true;
				count++;
			}
		}
		int even[]=new int [count];
		int odd[]=new int [arr.length-count];
		int j=0,k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(status[i]==true)
			{	
				even[j]=arr[i];
				j++;
			}
			else
			{
				odd[k]=arr[i];
				k++;
			}
		}
		System.out.println("Even array elements are:");
		for(int i=0;i<even.length;i++)
			System.out.println(even[i]);
		System.out.println("Odd array elements are:");
		for(int i=0;i<odd.length;i++)
			System.out.println(odd[i]);
	}
}
