import java.util.Scanner;

public class Split2DArray 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size i.e. rows and columns:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int [][] arr=new int[r][c];
		System.out.println("Enter "+(arr.length*arr[0].length)+" elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=sc.nextInt();
		}
		
		boolean [][] status=new boolean[r][c];
		for(int i=0;i<status.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				status[i][j]=true;
			}
		}
		int count=0;
		for(int i=0;i<status.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>1)
				{
					for(int x=2;x<arr[i][j]/2;x++)
					{
						if(arr[i][j]%x==0)
						{
							status[i][j]=false;
							count++;
							break;
						}
					}
				}
			}
		}
		int k=0,l=0;
		int [] NoPrime=new int[(r*c)-count];
		int [] Prime=new int[count];
		
		for(int i=0;i<status.length;i++)
		{
			for(int j=0;j<status[i].length;j++)
			{
				if(status[i][j])
				{
					Prime[k]=arr[i][j];
					k++;
				}
				else
				{
					NoPrime[l]=arr[i][j];
					l++;
				}
			}
		}
		System.out.println("Prime elements are:");
		for(int i=0;i<Prime.length;i++)
			System.out.println(Prime[i]+"\t");
		
		System.out.println("Non Prime elements are:");
		for(int i=0;i<NoPrime.length;i++)
			System.out.println(NoPrime[i]+"\t");
	}
}
