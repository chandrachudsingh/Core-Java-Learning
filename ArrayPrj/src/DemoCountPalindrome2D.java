import java.util.Scanner;

public class DemoCountPalindrome2D 
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
		int countArm=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				int sum=0,count=0;
				for(int x=arr[i][j];x>0;x/=10)
					count++;
				for(int x=arr[i][j];x>0;x/=10)
					sum+=Math.pow(x%10, count);
				if(sum==arr[i][j])
					countArm++;
			}
		}
		System.out.print("No. of Armstrong numbers="+countArm);
	}
}
