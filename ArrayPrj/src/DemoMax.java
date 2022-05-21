import java.util.Scanner;

public class DemoMax 
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
		
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print("Maximum="+max);
	}
}
