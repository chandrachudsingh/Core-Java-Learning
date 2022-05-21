import java.util.Scanner;

public class ArrayReadPrintFun 
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
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
	
		aRead(arr);
		aPrint(arr);
	}
}
