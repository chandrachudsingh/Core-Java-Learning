import java.util.Scanner;

public class DemoDiagonalElements 
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
		System.out.println("Diagonal elements of array are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if((i==j)||(i+j==arr.length-1))
					System.out.print(arr[i][j]+"\t");
				else
					System.out.print("\t");
				if(j==arr[i].length-1)
					System.out.println();
			}
		}
	}
}
