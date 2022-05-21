import java.util.Scanner;

public class Dynamic3DArrayLinearSearch 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of pages:");
		int p=sc.nextInt();
		int[][][] arr=new int[p][][];
	
		for(int k=0;k<arr.length;k++)
		{
			System.out.println("Enter number of rows of page "+(k+1));
			int r=sc.nextInt();
			arr[k]=new int[r][];
			
			for(int i=0;i<arr[k].length;i++)
			{
				System.out.println("Enter number of columns of row "+(i+1)+" of page "+(k+1));
				int c=sc.nextInt();
				arr[k][i]=new int[c];
			}
		}
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
		System.out.println("Enter a number to search");
		int item=sc.nextInt();
		
		int i=0,j=0,k=0,flag=0;
		outer:for(k=0;k<arr.length;k++)
		{
			for(i=0;i<arr[k].length;i++)
			{
				for(j=0;j<arr[k][i].length;j++)
				{
					if(arr[k][i][j]==item)
					{	flag=1;
						break outer;
					}
				}
			}
		}
		if(flag>0)
			System.out.print(item+" found at column "+(j+1)+" of row "+(i+1)+" of page "+(k+1));
		else
			System.out.print(item+" not found");
	}
}
