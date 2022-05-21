import java.util.Scanner;

public class DemoMaxOfRows 
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
				arr[i][j]=sc.nextInt();
		}
		int MaxArr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			MaxArr[i]=arr[i][0];
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>MaxArr[i])
					MaxArr[i]=arr[i][j];
			}
		}
		System.out.println("Maximum of each row are:");
		for(int i=0;i<MaxArr.length;i++)
			System.out.println(MaxArr[i]);
	}
}
