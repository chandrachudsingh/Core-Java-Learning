import java.util.Scanner;

public class DemoPattern 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pattern length:");
		int n=sc.nextInt();
		
		System.out.println("required Pattern is:");
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+"\t");
			System.out.println();
		}
	}
}
