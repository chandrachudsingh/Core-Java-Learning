import java.util.Scanner;

public class DemoCountArmstrongInRange 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range of numers:");
		int rbeg=sc.nextInt();
		int rend=sc.nextInt();
	
		int countno=0;
		for(int i=rbeg;i<rend;i++)
		{
			int count=0;
			for(int x=i;x>0;x/=10)
				count++;
			int revnum=0;
			for(int x=i;x>0;x/=10)
				revnum+=Math.pow(x%10, count);
			
			if(revnum==i)
				countno++;
		}
		System.out.print("No. of Armstring numbers="+countno);
	}
}
