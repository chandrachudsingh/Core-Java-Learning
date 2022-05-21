import java.util.Scanner;

public class DemoArray3D 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size i.e. pages,rows and columns:");
		
		int p=sc.nextInt();
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][][] arr=new int[p][r][c];
		
		for(int k=0;k<arr.length;k++)
		{
			for(int i=0;i<arr[k].length;i++)
			{
				for(int j=0;j<arr[k][i].length;j++)
				{
					System.out.println("Enter element "+(j+1)+" of page "+(k+1)+",row "+(i+1));
					arr[k][i][j]=sc.nextInt();
				}
					
			}
		}
		
		System.out.println("Array elements are:");
		for(int k=0;k<arr.length;k++)
		{
			for(int i=0;i<arr[k].length;i++)
			{
				for(int j=0;j<arr[k][i].length;j++)
				{
					System.out.print(arr[k][i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}
}
