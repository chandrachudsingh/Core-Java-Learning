import java.util.Scanner;

public class DemoMergeFun 
{
	static void aRead(int[] arr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
	}
	static void aPrint(int[] arr)
	{
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
	static void aMerge(int[] arr1,int[]arr2,int[]arr3)
	{
		for(int i=0;i<arr1.length;i++)
			arr3[i]=arr1[i];
	
		for(int i=arr1.length,j=0;j<arr2.length;i++,j++)
			arr3[i]=arr2[j];
		
	}
	
	static int[] aMerge(int[] arr1,int[]arr2)
	{
		int[]arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
			arr3[i]=arr1[i];
	
		for(int i=arr1.length,j=0;j<arr2.length;i++,j++)
			arr3[i]=arr2[j];
		return arr3;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter first array size");
		int n=sc.nextInt();
		
		int[] A=new int[n];
		aRead(A);
		aPrint(A);
		
		System.out.println("Enter second array size");
		int m=sc.nextInt();
		int[] B=new int[m];
		
		aRead(B);
		aPrint(B);
		
		/*int[] C=new int[A.length+B.length];
		aMerge(A,B,C);*/
		
		int[]C=aMerge(A, B);
		
		
		System.out.println("Merged array elements are:");
		aPrint(C);
	}	
}
