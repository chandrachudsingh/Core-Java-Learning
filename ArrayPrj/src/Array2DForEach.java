import java.util.Scanner;

public class Array2DForEach 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size i.e. Rows and Columns:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		
		System.out.println("Enter "+(arr.length*arr[0].length)+" elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter "+(j+1)+" element of "+(i+1)+" row ");
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for (int arr2[] : arr)
		{
			for(int num : arr2)
			{
				sum+=num;
				System.out.println(num);
			}
		}
		System.out.print("sum="+sum);		
	}
}
