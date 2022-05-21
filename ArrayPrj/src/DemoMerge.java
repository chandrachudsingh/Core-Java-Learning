import java.util.Scanner;

public class DemoMerge 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter first array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
       
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter second array size");
		int m=sc.nextInt();
		int[] arr2=new int[m];
		
		System.out.println("Enter "+m+" elements");
		for(int i=0;i<arr2.length;i++)
			arr2[i]=sc.nextInt();
	
		int[] arrmerge=new int[arr.length+arr2.length];
		
		for(int i=0;i<arr.length;i++)
				arrmerge[i]=arr[i];
		
		for(int i=arr.length,j=0;j<arr2.length;i++,j++)
				arrmerge[i]=arr2[j];
			
		
		System.out.println("Merged array elements are:");
		for(int i=0;i<arrmerge.length;i++)
			 System.out.println(arrmerge[i]);
	}	
}
