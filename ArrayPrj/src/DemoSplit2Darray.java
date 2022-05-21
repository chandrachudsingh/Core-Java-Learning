import java.util.Scanner;

public class DemoSplit2Darray 
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
		boolean status[][]=new boolean[arr.length][arr[0].length];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{	
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>1)
				{
					for(int x=2;x<=arr[i][j]/2;x++)
					{
						if(arr[i][j]%x==0)
						{
							status[i][j]=true;
							count++;
							break;
						}
					}
				}
			}
		}
		
		int prime[]=new int[(arr.length*arr[0].length)-count];
		int Noprime[]=new int[count];

		int k=0,l=0;
		for(int i=0;i<status.length;i++)
		{	for(int j=0;j<status[i].length;j++)
			{
				if(status[i][j]==true)
				{
					Noprime[k]=arr[i][j];
					k++;
				}
				else
				{
					prime[l]=arr[i][j];
					l++;
				}
			}
		}
		System.out.println("Prime elements are:");
		for(int i=0;i<prime.length;i++)
			System.out.println(prime[i]);
		System.out.println("Non-Prime elements are:");
		for(int i=0;i<Noprime.length;i++)
			System.out.println(Noprime[i]);
	}
}