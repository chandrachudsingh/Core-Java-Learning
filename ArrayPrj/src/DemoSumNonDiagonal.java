import java.util.Scanner;

public class DemoSumNonDiagonal 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size i.e. Rows and Columns:");
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		System.out.println("Enter "+(arr.length*arr.length)+" elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if((i!=j)&&(i+j)!=arr.length-1)
					sum+=arr[i][j];
			}
		}
		System.out.print("Sum of non-diagonal elements="+sum);
	}
}
