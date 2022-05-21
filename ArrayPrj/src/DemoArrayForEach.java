
import java.util.Scanner;

public class DemoArrayForEach 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter "+n+" Elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Array elements are:");
		//for(int i=0;i<n;i++)
		 //System.out.println(arr[i]);
		int sum=0;
		for (int num : arr)
		{
			sum+=num;
			System.out.println(num);
		}
		System.out.print("sum="+sum);
	}
}