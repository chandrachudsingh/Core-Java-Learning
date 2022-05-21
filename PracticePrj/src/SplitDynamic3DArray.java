import java.util.Scanner;

public class SplitDynamic3DArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of pages of array:");
		int p=sc.nextInt();
		int[][][] arr=new int[p][][];
		for(int k=0;k<arr.length;k++)
		{
			System.out.println("Enter no. of rows of page "+(k+1));
			int r=sc.nextInt();
			arr[p]=new int[r][];
			
			for(int i=0;i<arr[k].length;i++)
			{
				System.out.println("Enter no. of columns of row "+(i+1)+" of column "+(k+1));
				int c=sc.nextInt();
				arr[p][r]=new int[c];
			}
		}
		arrRead(arr);
		arrSplit(arr);
	}
	
	public static void arrRead(int[][][] arr)
	{
		Scanner sc=new Scanner(System.in);
		
		for(int k=0;k<arr.length;k++)
		{
			for(int i=0;i<arr[k].length;i++)
			{
				for(int j=0;j<arr[k][i].length;j++)
				{
					System.out.println("Enter array element of column "+(j+1)+" of row "+(i+1)+" of page "+(k+1));
					arr[k][i][j]=sc.nextInt();
				}
			}
		}
	}
	
	public static void arrSplit(int[][][] arr)
	{
		boolean[][][] status=new boolean[arr.length][arr[0].length][arr[0][0].length];
		int count=0;
		outer:for(int k=0;k<status.length;k++)
		{
			for(int i=0;i<status[k].length;i++)
			{
				for(int j=0;j<status[k][i].length;j++)
				{
					if(arr[k][i][j]>1)
					{
						for(int x=2;x<arr[k][i][j]/2;x++)
						{
							if(arr[k][i][j]%2==0)
							{
								status[k][i][j]=true;
								count++;
								break outer;
							}
						}
					}
				}
			}
		}
		
		int[] Prime=new int[(arr.length*arr[0].length*arr[0][0].length)-count];
		int[] NoPrime=new int[count];
		int l=0,m=0;
		for(int k=0;k<arr.length;k++)
		{
			for(int i=0;i<arr[k].length;i++)
			{
				for(int j=0;j<arr[k][i].length;j++)
				{
					if(status[k][i][j]=false)
					{
						Prime[l]=arr[k][i][j];
						l++;
					}
					else
					{
						NoPrime[m]=arr[k][i][j];
						m++;
					}
				}
			}
		}			
		
		System.out.println("Prime array elements are:");
		for(int i=0;i<Prime.length;i++)
			System.out.println(Prime[i]+"\t");
		
		System.out.println("Non-Prime array elements are:");
		for(int i=0;i<NoPrime.length;i++)
			System.out.println(NoPrime[i]+"\t");
	}
}
