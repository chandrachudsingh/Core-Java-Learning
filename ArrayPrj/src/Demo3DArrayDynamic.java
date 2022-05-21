import java.util.Scanner;

public class Demo3DArrayDynamic 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter number of pages:");
		int p=sc.nextInt();
		int[][][] mat3d=new int [p][][];
		
		for(int k=0;k<mat3d.length;k++)
		{
			System.out.println("Enter number of rows of page "+(k+1));
			int r=sc.nextInt();
			mat3d[k]=new int [r][];
		
			for(int i=0;i<mat3d[k].length;i++)
			{
				System.out.println("Enter number of columns of row "+(i+1)+" of page "+(k+1)+":");
				int c=sc.nextInt();
				mat3d[k][i]=new int[c];
			}
		}
			
		for(int k=0;k<mat3d.length;k++)
		{
			for(int i=0;i<mat3d[k].length;i++)
			{
				for(int j=0;j<mat3d[k][i].length;j++)
				{
					System.out.println("Enter element "+(j+1)+" of page "+(k+1)+",row "+(i+1));
					mat3d[k][i][j]=sc.nextInt();
				}
					
			}
		}
		
		System.out.println("Array elements are:");
		for(int k=0;k<mat3d.length;k++)
		{
			for(int i=0;i<mat3d[k].length;i++)
			{
				for(int j=0;j<mat3d[k][i].length;j++)
				{
					System.out.print(mat3d[k][i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}
}
